// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.omnibox;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.TextView;

import android.annotation.NonNull;
import android.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.CallbackController;
import org.chromium.base.CommandLine;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.metrics.RecordUserAction;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.OneshotSupplier;
import org.chromium.base.supplier.OneshotSupplierImpl;
import org.chromium.chrome.browser.flags.ChromeSwitches;
import org.chromium.chrome.browser.gsa.GSAState;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.native_page.NativePageFactory;
import org.chromium.chrome.browser.ntp.FakeboxDelegate;
import org.chromium.chrome.browser.ntp.NewTabPageUma;
import org.chromium.chrome.browser.omnibox.UrlBar.UrlBarDelegate;
import org.chromium.chrome.browser.omnibox.UrlBarCoordinator.SelectionState;
import org.chromium.chrome.browser.omnibox.geo.GeolocationHeader;
import org.chromium.chrome.browser.omnibox.status.StatusCoordinator;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteCoordinator;
import org.chromium.chrome.browser.omnibox.voice.AssistantVoiceSearchService;
import org.chromium.chrome.browser.omnibox.voice.VoiceRecognitionHandler;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManagerImpl;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.util.KeyNavigationUtil;
import org.chromium.components.browser_ui.styles.ChromeColors;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.components.externalauth.ExternalAuthUtils;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.search_engines.TemplateUrlService.TemplateUrlServiceObserver;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.PageTransition;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.util.ColorUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Mediator for the LocationBar component. Intended location for LocationBar business logic;
 * currently, migration of this logic out of LocationBarLayout is in progress.
 */
class LocationBarMediator implements LocationBarDataProvider.Observer, FakeboxDelegate,
                                     VoiceRecognitionHandler.Delegate,
                                     AssistantVoiceSearchService.Observer, UrlBarDelegate,
                                     OnKeyListener, ComponentCallbacks, TemplateUrlServiceObserver {
    private final LocationBarLayout mLocationBarLayout;
    private VoiceRecognitionHandler mVoiceRecognitionHandler;
    private final LocationBarDataProvider mLocationBarDataProvider;
    private final OneshotSupplierImpl<AssistantVoiceSearchService>
            mAssistantVoiceSearchServiceSupplier = new OneshotSupplierImpl<>();
    private StatusCoordinator mStatusCoordinator;
    private AutocompleteCoordinator mAutocompleteCoordinator;
    private OmniboxPrerender mOmniboxPrerender;
    private UrlBarCoordinator mUrlCoordinator;
    private final ObservableSupplier<Profile> mProfileSupplier;
    private PrivacyPreferencesManagerImpl mPrivacyPreferencesManager;
    private final CallbackController mCallbackController = new CallbackController();
    private final OverrideUrlLoadingDelegate mOverrideUrlLoadingDelegate;
    private final LocaleManager mLocaleManager;
    private final List<Runnable> mDeferredNativeRunnables = new ArrayList<>();
    private final OneshotSupplier<TemplateUrlService> mTemplateUrlServiceSupplier;
    private TemplateUrl mSearchEngine;
    private final Context mContext;
    private final BackKeyBehaviorDelegate mBackKeyBehavior;
    private final WindowAndroid mWindowAndroid;
    private String mOriginalUrl = "";

    private boolean mNativeInitialized;

    /*package */ LocationBarMediator(@NonNull Context context,
            @NonNull LocationBarLayout locationBarLayout,
            @NonNull LocationBarDataProvider locationBarDataProvider,
            @NonNull ObservableSupplier<Profile> profileSupplier,
            @NonNull PrivacyPreferencesManagerImpl privacyPreferencesManager,
            @NonNull OverrideUrlLoadingDelegate overrideUrlLoadingDelegate,
            @NonNull LocaleManager localeManager,
            @NonNull OneshotSupplier<TemplateUrlService> templateUrlServiceSupplier,
            @NonNull BackKeyBehaviorDelegate backKeyBehavior,
            @NonNull WindowAndroid windowAndroid) {
        mContext = context;
        mLocationBarLayout = locationBarLayout;
        mLocationBarDataProvider = locationBarDataProvider;
        mLocationBarDataProvider.addObserver(this);
        mOverrideUrlLoadingDelegate = overrideUrlLoadingDelegate;
        mLocaleManager = localeManager;
        mVoiceRecognitionHandler =
                new VoiceRecognitionHandler(this, mAssistantVoiceSearchServiceSupplier);
        mProfileSupplier = profileSupplier;
        mProfileSupplier.addObserver(mCallbackController.makeCancelable(this::setProfile));
        mPrivacyPreferencesManager = privacyPreferencesManager;
        mTemplateUrlServiceSupplier = templateUrlServiceSupplier;
        mBackKeyBehavior = backKeyBehavior;
        mWindowAndroid = windowAndroid;
    }

    /**
     * Sets coordinators post-construction; they can't be set at construction time since
     * LocationBarMediator is a delegate for them, so is constructed beforehand.
     *
     * @param urlCoordinator Coordinator for the url bar.
     * @param autocompleteCoordinator Coordinator for the autocomplete component.
     * @param statusCoordinator Coordinator for the status icon.
     */
    /*package */ void setCoordinators(UrlBarCoordinator urlCoordinator,
            AutocompleteCoordinator autocompleteCoordinator, StatusCoordinator statusCoordinator) {
        mUrlCoordinator = urlCoordinator;
        mAutocompleteCoordinator = autocompleteCoordinator;
        mStatusCoordinator = statusCoordinator;
    }

    /*package */ void destroy() {
        if (mAssistantVoiceSearchServiceSupplier.get() != null) {
            mAssistantVoiceSearchServiceSupplier.get().destroy();
        }
        mStatusCoordinator = null;
        mAutocompleteCoordinator = null;
        mUrlCoordinator = null;
        mPrivacyPreferencesManager = null;
        mVoiceRecognitionHandler.destroy();
        mVoiceRecognitionHandler = null;
        mLocationBarDataProvider.removeObserver(this);
        mDeferredNativeRunnables.clear();
        TemplateUrlService templateUrlService = mTemplateUrlServiceSupplier.get();
        if (templateUrlService != null) {
            templateUrlService.removeObserver(this);
        }
    }

    /*package */ void onUrlFocusChange(boolean hasFocus) {
        mLocationBarLayout.onUrlFocusChange(hasFocus);
        onPrimaryColorChanged();
        mLocationBarLayout.updateStatusVisibility();
        // Focus change caused by a closed tab may result in there not being an active tab.
        if (!hasFocus && mLocationBarDataProvider.hasTab()) {
            setUrl(mLocationBarDataProvider.getCurrentUrl(),
                    mLocationBarDataProvider.getUrlBarData());
        }
    }

    /*package */ void onFinishNativeInitialization() {
        mNativeInitialized = true;
        mTemplateUrlServiceSupplier.get().runWhenLoaded(this::registerTemplateUrlObserver);
        mOmniboxPrerender = new OmniboxPrerender();
        mAssistantVoiceSearchServiceSupplier.set(new AssistantVoiceSearchService(mContext,
                ExternalAuthUtils.getInstance(), mTemplateUrlServiceSupplier.get(),
                GSAState.getInstance(mContext), this, SharedPreferencesManager.getInstance()));
        onAssistantVoiceSearchServiceChanged();
        mLocationBarLayout.onFinishNativeInitialization();
        setProfile(mProfileSupplier.get());
        onPrimaryColorChanged();
        mLocationBarLayout.updateStatusVisibility();

        for (Runnable deferredRunnable : mDeferredNativeRunnables) {
            mLocationBarLayout.post(deferredRunnable);
        }
        mDeferredNativeRunnables.clear();
        updateMicButtonState();
    }

    /*package */ void setUrlFocusChangeFraction(float fraction) {
        mLocationBarLayout.setUrlFocusChangeFraction(fraction);
    }

    /*package */ void setUnfocusedWidth(int unfocusedWidth) {
        mLocationBarLayout.setUnfocusedWidth(unfocusedWidth);
    }

    /* package */ void setVoiceRecognitionHandlerForTesting(
            VoiceRecognitionHandler voiceRecognitionHandler) {
        mVoiceRecognitionHandler = voiceRecognitionHandler;
    }

    /* package */ void setAssistantVoiceSearchServiceForTesting(
            AssistantVoiceSearchService assistantVoiceSearchService) {
        mAssistantVoiceSearchServiceSupplier.set(assistantVoiceSearchService);
        onAssistantVoiceSearchServiceChanged();
    }

    /* package */ OneshotSupplier<AssistantVoiceSearchService>
    getAssistantVoiceSearchServiceSupplierForTesting() {
        return mAssistantVoiceSearchServiceSupplier;
    }

    /*package */ void updateVisualsForState() {
        onPrimaryColorChanged();
    }

    /*package */ void setShowTitle(boolean showTitle) {
        // This method is only used in CustomTabToolbar.
    }

    /*package */ void showUrlBarCursorWithoutFocusAnimations() {
        if (mLocationBarLayout.isUrlBarFocused() || mLocationBarLayout.didFocusUrlFromFakebox()) {
            return;
        }

        mLocationBarLayout.setIsUrlFocusedWithoutAnimations(true);
        // This method should only be called on devices with a hardware keyboard attached, as
        // described in the documentation for LocationBar#showUrlBarCursorWithoutFocusAnimations.
        setUrlBarFocus(/*shouldBeFocused=*/true, /*pastedText=*/null,
                OmniboxFocusReason.DEFAULT_WITH_HARDWARE_KEYBOARD);
    }

    /*package */ void revertChanges() {
        if (mLocationBarLayout.isUrlBarFocused()) {
            String currentUrl = mLocationBarDataProvider.getCurrentUrl();
            if (NativePageFactory.isNativePageUrl(
                        currentUrl, mLocationBarDataProvider.isIncognito())) {
                mLocationBarLayout.setUrlBarTextEmpty();
            } else {
                mLocationBarLayout.setUrlBarText(mLocationBarDataProvider.getUrlBarData(),
                        UrlBar.ScrollType.NO_SCROLL, SelectionState.SELECT_ALL);
            }
            mUrlCoordinator.setKeyboardVisibility(false, false);
        } else {
            setUrl(mLocationBarDataProvider.getCurrentUrl(),
                    mLocationBarDataProvider.getUrlBarData());
        }
    }

    /* package */ void onUrlTextChanged() {
        updateButtonVisibility();
    }

    /* package */ void onSuggestionsChanged(String autocompleteText, boolean defaultMatchIsSearch) {
        // TODO (https://crbug.com/1152501): Refactor the LBM/LBC relationship such that LBM doesn't
        // need to communicate with other coordinators like this.
        mStatusCoordinator.onDefaultMatchClassified(defaultMatchIsSearch);
        String userText = mUrlCoordinator.getTextWithoutAutocomplete();
        if (mUrlCoordinator.shouldAutocomplete()) {
            mUrlCoordinator.setAutocompleteText(userText, autocompleteText);
        }

        // Handle the case where suggestions (in particular zero suggest) are received without the
        // URL focusing happening.
        if (mLocationBarLayout.isUrlBarFocusedWithoutAnimations()
                && mLocationBarLayout.isUrlBarFocused()) {
            mLocationBarLayout.handleUrlFocusAnimation(/*hasFocus=*/true);
        }

        if (mNativeInitialized
                && !CommandLine.getInstance().hasSwitch(ChromeSwitches.DISABLE_INSTANT)
                && mPrivacyPreferencesManager.shouldPrerender()
                && mLocationBarDataProvider.hasTab()) {
            mOmniboxPrerender.prerenderMaybe(userText, mOriginalUrl,
                    mAutocompleteCoordinator.getCurrentNativeAutocompleteResult(),
                    mProfileSupplier.get(), mLocationBarDataProvider.getTab());
        }
    }

    /* package */ void loadUrl(String url, int transition, long inputStart) {
        loadUrlWithPostData(url, transition, inputStart, null, null);
    }

    /* package */ void loadUrlWithPostData(
            String url, int transition, long inputStart, String postDataType, byte[] postData) {
        assert mLocationBarDataProvider != null;
        Tab currentTab = mLocationBarDataProvider.getTab();

        // The code of the rest of this class ensures that this can't be called until the native
        // side is initialized
        assert mNativeInitialized : "Loading URL before native side initialized";

        // TODO(crbug.com/1085812): Should be taking a full loaded LoadUrlParams.
        if (mOverrideUrlLoadingDelegate.willHandleLoadUrlWithPostData(url, transition, postDataType,
                    postData, mLocationBarDataProvider.isIncognito())) {
            return;
        }

        if (currentTab != null
                && (currentTab.isNativePage()
                        || UrlUtilities.isNTPUrl(currentTab.getUrlString()))) {
            NewTabPageUma.recordOmniboxNavigation(url, transition);
            // Passing in an empty string should not do anything unless the user is at the NTP.
            // Since the NTP has no url, pressing enter while clicking on the URL bar should refresh
            // the page as it does when you click and press enter on any other site.
            if (url.isEmpty()) url = currentTab.getUrlString();
        }

        // Loads the |url| in a new tab or the current ContentView and gives focus to the
        // ContentView.
        if (currentTab != null && !url.isEmpty()) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(url);
            loadUrlParams.setVerbatimHeaders(GeolocationHeader.getGeoHeader(url, currentTab));
            loadUrlParams.setTransitionType(transition | PageTransition.FROM_ADDRESS_BAR);
            if (inputStart != 0) {
                loadUrlParams.setInputStartTimestamp(inputStart);
            }

            if (!TextUtils.isEmpty(postDataType)) {
                StringBuilder headers = new StringBuilder();
                String prevHeader = loadUrlParams.getVerbatimHeaders();
                if (prevHeader != null && !prevHeader.isEmpty()) {
                    headers.append(prevHeader);
                    headers.append("\r\n");
                }
                loadUrlParams.setExtraHeaders(new HashMap<String, String>() {
                    { put("Content-Type", postDataType); }
                });
                headers.append(loadUrlParams.getExtraHttpRequestHeadersString());
                loadUrlParams.setVerbatimHeaders(headers.toString());
            }

            if (postData != null && postData.length != 0) {
                loadUrlParams.setPostData(ResourceRequestBody.createFromBytes(postData));
            }

            currentTab.loadUrl(loadUrlParams);
            RecordUserAction.record("MobileOmniboxUse");
        }
        mLocaleManager.recordLocaleBasedSearchMetrics(false, url, transition);

        focusCurrentTab();
    }

    /* package */ boolean didFocusUrlFromFakebox() {
        return mLocationBarLayout.didFocusUrlFromFakebox();
    }

    /* package */ boolean didFocusUrlFromQueryTiles() {
        return mLocationBarLayout.didFocusUrlFromQueryTiles();
    }

    /** Updates the visibility of the buttons inside the location bar. */
    /* package */ void updateButtonVisibility() {
        mLocationBarLayout.updateButtonVisibility();
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    /* package */ void registerTemplateUrlObserver() {
        final TemplateUrlService templateUrlService = mTemplateUrlServiceSupplier.get();
        templateUrlService.addObserver(this);

        // Force an update once to populate initial data.
        onTemplateURLServiceChanged();
    }

    /**
     * Sets the displayed URL according to the provided url string and UrlBarData.
     *
     * <p>The URL is converted to the most user friendly format (removing HTTP:// for example).
     *
     * <p>If the current tab is null, the URL text will be cleared.
     */
    /* package */ void setUrl(String currentUrlString, UrlBarData urlBarData) {
        // If the URL is currently focused, do not replace the text they have entered with the URL.
        // Once they stop editing the URL, the current tab's URL will automatically be filled in.
        if (mUrlCoordinator.hasFocus()) {
            if (mLocationBarLayout.isUrlBarFocusedWithoutAnimations()
                    && !UrlUtilities.isNTPUrl(currentUrlString)) {
                // If we did not run the focus animations, then the user has not typed any text.
                // So, clear the focus and accept whatever URL the page is currently attempting to
                // display. If the NTP is showing, the current page's URL should not be displayed.
                setUrlBarFocus(false, null, OmniboxFocusReason.UNFOCUS);
            } else {
                return;
            }
        }

        mOriginalUrl = currentUrlString;
        mLocationBarLayout.setUrlBarText(
                urlBarData, UrlBar.ScrollType.SCROLL_TO_TLD, SelectionState.SELECT_ALL);
    }

    /* package */ void deleteButtonClicked(View view) {
        if (!mNativeInitialized) return;
        RecordUserAction.record("MobileOmniboxDeleteUrl");
        mLocationBarLayout.setUrlBarTextEmpty();
        updateButtonVisibility();
    }

    /* package */ void micButtonClicked(View view) {
        if (!mNativeInitialized) return;
        RecordUserAction.record("MobileOmniboxVoiceSearch");
        mVoiceRecognitionHandler.startVoiceRecognition(
                VoiceRecognitionHandler.VoiceInteractionSource.OMNIBOX);
    }

    /* package */ void setUrlFocusChangeInProgress(boolean inProgress) {
        mLocationBarLayout.setUrlFocusChangeInProgress(inProgress);
    }

    // Private methods

    private void setProfile(Profile profile) {
        if (profile == null || !mNativeInitialized) return;
        mAutocompleteCoordinator.setAutocompleteProfile(profile);
        mOmniboxPrerender.initializeForProfile(profile);

        mLocationBarLayout.setShowIconsWhenUrlFocused(
                SearchEngineLogoUtils.shouldShowSearchEngineLogo(profile.isOffTheRecord()));
    }

    private void focusCurrentTab() {
        assert mLocationBarDataProvider != null;
        if (mLocationBarDataProvider.hasTab()) {
            View view = mLocationBarDataProvider.getTab().getView();
            if (view != null) view.requestFocus();
        }
    }

    @VisibleForTesting
    /* package */ void updateAssistantVoiceSearchDrawableAndColors() {
        AssistantVoiceSearchService assistantVoiceSearchService =
                mAssistantVoiceSearchServiceSupplier.get();
        if (assistantVoiceSearchService == null) return;

        mLocationBarLayout.setMicButtonTint(assistantVoiceSearchService.getMicButtonColorStateList(
                getPrimaryBackgroundColor(), mContext));
        mLocationBarLayout.setMicButtonDrawable(
                assistantVoiceSearchService.getCurrentMicDrawable());
    }

    /**
     * Update visuals to use a correct light or dark color scheme depending on the primary color.
     */
    @VisibleForTesting
    /* package */ void updateUseDarkColors() {
        // TODO(crbug.com/1114183): Unify light and dark color logic in chrome and make it clear
        // whether the foreground or background color is dark.
        final boolean useDarkColors =
                !ColorUtils.shouldUseLightForegroundOnBackground(getPrimaryBackgroundColor());

        mLocationBarLayout.setDeleteButtonTint(
                ChromeColors.getPrimaryIconTint(mContext, !useDarkColors));
        // If the URL changed colors and is not focused, update the URL to account for the new
        // color scheme.
        if (mUrlCoordinator.setUseDarkTextColors(useDarkColors) && !isUrlBarFocused()) {
            updateUrl();
        }
        mStatusCoordinator.setUseDarkColors(useDarkColors);
        if (mAutocompleteCoordinator != null) {
            mAutocompleteCoordinator.updateVisualsForState(
                    useDarkColors, mLocationBarDataProvider.isIncognito());
        }
    }

    /** Returns the primary color based on the url focus, and incognito state. */
    private int getPrimaryBackgroundColor() {
        // If the url bar is focused, the toolbar background color is the default color regardless
        // of whether it is branded or not.
        if (isUrlBarFocused()) {
            return ChromeColors.getDefaultThemeColor(
                    mContext.getResources(), mLocationBarDataProvider.isIncognito());
        } else {
            return mLocationBarDataProvider.getPrimaryColor();
        }
    }

    private void recordOmniboxFocusReason(@OmniboxFocusReason int reason) {
        RecordHistogram.recordEnumeratedHistogram(
                "Android.OmniboxFocusReason", reason, OmniboxFocusReason.NUM_ENTRIES);
    }

    // LocationBarData.Observer implementation
    // Using the default empty onSecurityStateChanged.
    // Using the default empty onTitleChanged.

    @Override
    public void onIncognitoStateChanged() {
        updateMicButtonState();
    }

    @Override
    public void onNtpStartedLoading() {
        mLocationBarLayout.onNtpStartedLoading();
    }

    @Override
    public void onPrimaryColorChanged() {
        updateAssistantVoiceSearchDrawableAndColors();
        updateUseDarkColors();
        mLocationBarLayout.updateStatusVisibility();
    }

    @Override
    public void onUrlChanged() {
        updateUrl();
        updateOmniboxPrerender();
        updateButtonVisibility();
    }

    private void updateUrl() {
        setUrl(mLocationBarDataProvider.getCurrentUrl(), mLocationBarDataProvider.getUrlBarData());
    }

    private void updateOmniboxPrerender() {
        if (mOmniboxPrerender == null) return;
        // Profile may be null if switching to a tab that has not yet been initialized.
        Profile profile = mProfileSupplier.get();
        if (profile == null) return;
        mOmniboxPrerender.clear(profile);
    }

    // FakeboxDelegate implementation.

    @Override
    public void setUrlBarFocus(boolean shouldBeFocused, @Nullable String pastedText, int reason) {
        boolean urlHasFocus = mLocationBarLayout.isUrlBarFocused();
        if (shouldBeFocused) {
            if (!urlHasFocus) recordOmniboxFocusReason(reason);
            if (reason == OmniboxFocusReason.FAKE_BOX_TAP
                    || reason == OmniboxFocusReason.FAKE_BOX_LONG_PRESS
                    || reason == OmniboxFocusReason.TASKS_SURFACE_FAKE_BOX_LONG_PRESS
                    || reason == OmniboxFocusReason.TASKS_SURFACE_FAKE_BOX_TAP) {
                mLocationBarLayout.setUrlFocusedFromFakebox(true);
            }

            if (reason == OmniboxFocusReason.QUERY_TILES_NTP_TAP) {
                mLocationBarLayout.setUrlFocusedFromFakebox(true);
                mLocationBarLayout.setUrlFocusedFromQueryTiles(true);
            }

            if (urlHasFocus && mLocationBarLayout.isUrlBarFocusedWithoutAnimations()) {
                mLocationBarLayout.handleUrlFocusAnimation(true);
            } else {
                mUrlCoordinator.requestFocus();
            }
        } else {
            assert pastedText == null;
            mUrlCoordinator.clearFocus();
        }

        if (pastedText != null) {
            // This must be happen after requestUrlFocus(), which changes the selection.
            mUrlCoordinator.setUrlBarData(UrlBarData.forNonUrlText(pastedText),
                    UrlBar.ScrollType.NO_SCROLL, UrlBarCoordinator.SelectionState.SELECT_END);
            mLocationBarLayout.forceOnTextChanged();
        }
    }

    @Override
    public void performSearchQuery(String query, List<String> searchParams) {
        if (TextUtils.isEmpty(query)) return;

        String queryUrl =
                mTemplateUrlServiceSupplier.get().getUrlForSearchQuery(query, searchParams);

        if (!TextUtils.isEmpty(queryUrl)) {
            loadUrl(queryUrl, PageTransition.GENERATED, 0);
        } else {
            setSearchQuery(query);
        }
    }

    @Override
    public @Nullable VoiceRecognitionHandler getVoiceRecognitionHandler() {
        // TODO(crbug.com/1140333): StartSurfaceMediator can call this method after destroy().
        if (mLocationBarLayout == null) {
            return null;
        }

        return mVoiceRecognitionHandler;
    }

    @Override
    public void addUrlFocusChangeListener(UrlFocusChangeListener listener) {
        mLocationBarLayout.addUrlFocusChangeListener(listener);
    }

    @Override
    public void removeUrlFocusChangeListener(UrlFocusChangeListener listener) {
        mLocationBarLayout.removeUrlFocusChangeListener(listener);
    }

    @Override
    public boolean isUrlBarFocused() {
        return mLocationBarLayout.isUrlBarFocused();
    }

    @Override
    public void clearOmniboxFocus() {
        setUrlBarFocus(/*shouldBeFocused=*/false, /*pastedText=*/null, OmniboxFocusReason.UNFOCUS);
    }

    // AssistantVoiceSearchService.Observer implementation.

    @Override
    public void onAssistantVoiceSearchServiceChanged() {
        updateAssistantVoiceSearchDrawableAndColors();
    }

    // VoiceRecognitionHandler.Delegate implementation.

    @Override
    public void loadUrlFromVoice(String url) {
        loadUrl(url, PageTransition.TYPED, 0);
    }

    @Override
    public void updateMicButtonState() {
        mLocationBarLayout.setVoiceSearchEnabled(mVoiceRecognitionHandler != null
                && mVoiceRecognitionHandler.isVoiceSearchEnabled());
        updateButtonVisibility();
    }

    @Override
    public void setSearchQuery(String query) {
        if (TextUtils.isEmpty(query)) return;

        if (!mNativeInitialized) {
            mDeferredNativeRunnables.add(() -> setSearchQuery(query));
            return;
        }

        // Ensure the UrlBar has focus before entering text. If the UrlBar is not focused,
        // autocomplete text will be updated but the visible text will not.
        setUrlBarFocus(
                /*shouldBeFocused=*/true, /*pastedText=*/null, OmniboxFocusReason.SEARCH_QUERY);
        mLocationBarLayout.setUrlBarText(UrlBarData.forNonUrlText(query),
                UrlBar.ScrollType.NO_SCROLL, SelectionState.SELECT_ALL);
        mAutocompleteCoordinator.startAutocompleteForQuery(query);
        mUrlCoordinator.setKeyboardVisibility(true, false);
    }

    @Override
    public LocationBarDataProvider getLocationBarDataProvider() {
        return mLocationBarDataProvider;
    }

    @Override
    public AutocompleteCoordinator getAutocompleteCoordinator() {
        return mAutocompleteCoordinator;
    }

    @Override
    public WindowAndroid getWindowAndroid() {
        return mWindowAndroid;
    }

    // UrlBarDelegate implementation.

    @Nullable
    @Override
    public View getViewForUrlBackFocus() {
        assert mLocationBarDataProvider != null;
        Tab tab = mLocationBarDataProvider.getTab();
        return tab == null ? null : tab.getView();
    }

    @Override
    public boolean allowKeyboardLearning() {
        return !mLocationBarDataProvider.isIncognito();
    }

    @Override
    public void backKeyPressed() {
        if (mBackKeyBehavior.handleBackKeyPressed()) {
            return;
        }

        setUrlBarFocus(false, null, OmniboxFocusReason.UNFOCUS);
        // Revert the URL to match the current page.
        setUrl(mLocationBarDataProvider.getCurrentUrl(), mLocationBarDataProvider.getUrlBarData());
        focusCurrentTab();
    }

    @Override
    public void gestureDetected(boolean isLongPress) {
        recordOmniboxFocusReason(isLongPress ? OmniboxFocusReason.OMNIBOX_LONG_PRESS
                                             : OmniboxFocusReason.OMNIBOX_TAP);
    }

    // OnKeyListener implementation.
    @Override
    public boolean onKey(View view, int keyCode, KeyEvent event) {
        boolean result = handleKeyEvent(view, keyCode, event);

        if (result && mLocationBarLayout.isUrlBarFocused()
                && mLocationBarLayout.isUrlBarFocusedWithoutAnimations()
                && event.getAction() == KeyEvent.ACTION_DOWN && event.isPrintingKey()
                && event.hasNoModifiers()) {
            mLocationBarLayout.handleUrlFocusAnimation(/*hasFocus=*/true);
        }

        return result;
    }

    private boolean handleKeyEvent(View view, int keyCode, KeyEvent event) {
        boolean isRtl = view.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
        if (mAutocompleteCoordinator.handleKeyEvent(keyCode, event)) {
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (KeyNavigationUtil.isActionDown(event) && event.getRepeatCount() == 0) {
                // Tell the framework to start tracking this event.
                mLocationBarLayout.getKeyDispatcherState().startTracking(event, this);
                return true;
            } else if (KeyNavigationUtil.isActionUp(event)) {
                mLocationBarLayout.getKeyDispatcherState().handleUpEvent(event);
                if (event.isTracking() && !event.isCanceled()) {
                    backKeyPressed();
                    return true;
                }
            }
        } else if (keyCode == KeyEvent.KEYCODE_ESCAPE) {
            if (KeyNavigationUtil.isActionDown(event) && event.getRepeatCount() == 0) {
                revertChanges();
                return true;
            }
        } else if ((!isRtl && KeyNavigationUtil.isGoRight(event))
                || (isRtl && KeyNavigationUtil.isGoLeft(event))) {
            // Ensures URL bar doesn't lose focus, when RIGHT or LEFT (RTL) key is pressed while
            // the cursor is positioned at the end of the text.
            TextView tv = (TextView) view;
            return tv.getSelectionStart() == tv.getSelectionEnd()
                    && tv.getSelectionEnd() == tv.getText().length();
        }
        return false;
    }

    // ComponentCallbacks implementation.

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (mLocationBarLayout.isUrlBarFocused()
                && mLocationBarLayout.isUrlBarFocusedWithoutAnimations()
                && newConfig.keyboard != Configuration.KEYBOARD_QWERTY) {
            // If we lose the hardware keyboard and the focus animations were not run, then the
            // user has not typed any text, so we will just clear the focus instead.
            setUrlBarFocus(
                    /*shouldBeFocused=*/false, /*pastedText=*/null, OmniboxFocusReason.UNFOCUS);
        }
    }

    @Override
    public void onLowMemory() {}

    // TemplateUrlServiceObserver implementation.

    @Override
    public void onTemplateURLServiceChanged() {
        TemplateUrlService templateUrlService = mTemplateUrlServiceSupplier.get();
        TemplateUrl searchEngine = templateUrlService.getDefaultSearchEngineTemplateUrl();
        if ((mSearchEngine == null && searchEngine == null)
                || (mSearchEngine != null && mSearchEngine.equals(searchEngine))) {
            return;
        }

        mSearchEngine = searchEngine;
        mLocationBarLayout.updateSearchEngineStatusIcon(
                SearchEngineLogoUtils.shouldShowSearchEngineLogo(
                        mLocationBarDataProvider.isIncognito()),
                templateUrlService.isDefaultSearchEngineGoogle(),
                SearchEngineLogoUtils.getSearchLogoUrl(templateUrlService));
    }
}
