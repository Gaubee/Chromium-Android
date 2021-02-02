// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.signin.ui.account_picker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.chromium.chrome.browser.signin.services.DisplayableProfileData;
//import org.chromium.chrome.browser.signin.ui.R;
import org.bnqkl.bfchromiun.R;
import org.chromium.chrome.browser.signin.ui.account_picker.AccountPickerBottomSheetProperties.ViewState;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetContent;
import org.chromium.ui.widget.ButtonCompat;

/**
 * This class is the AccountPickerBottomsheet view for the web sign-in flow.
 *
 * The bottom sheet shows a single account with a |Continue as ...| button by default, clicking
 * on the account will expand the bottom sheet to an account list together with other sign-in
 * options like "Add account" and "Go incognito mode".
 */
class AccountPickerBottomSheetView implements BottomSheetContent {
    /**
     * Listener for the back-press button.
     */
    interface BackPressListener {
        /**
         * Notifies when user clicks the back-press button.
         * @return true if the listener handles the back press, false if not.
         */
        boolean onBackPressed();
    }

    /**
     * The title id for each screen of the bottom sheet's view flipper, the position of
     * each id corresponds to the value of {@link ViewState}. It is used to set focus
     * on title when the view flipper moves to a new screen.
     */
    private static final @IdRes int[] sTitleIds = new int[] {
            R.id.account_picker_header_title,
            R.id.account_picker_header_title,
            R.id.account_picker_header_title,
            R.id.account_picker_signin_in_progress_title,
            R.id.incognito_interstitial_title,
            R.id.account_picker_general_error_title,
            R.id.account_picker_auth_error_title,
    };

    private final Activity mActivity;
    private final BackPressListener mBackPressListener;
    private final View mContentView;
    private final ViewFlipper mViewFlipper;
    private final RecyclerView mAccountListView;
    private final View mSelectedAccountView;
    private final ButtonCompat mDismissButton;

    /**
     * @param activity The activity that hosts this view. Used for inflating views.
     * @param backPressListener The listener to be notified when the user taps the back button.
     */
    AccountPickerBottomSheetView(Activity activity, BackPressListener backPressListener) {
        mActivity = activity;
        mBackPressListener = backPressListener;
        mContentView = LayoutInflater.from(mActivity).inflate(
                R.layout.account_picker_bottom_sheet_view, null);

        mViewFlipper = mContentView.findViewById(R.id.account_picker_state_view_flipper);
        checkViewFlipperChildrenAndViewStateMatch(mViewFlipper);
        mAccountListView = mViewFlipper.getChildAt(ViewState.EXPANDED_ACCOUNT_LIST)
                                   .findViewById(R.id.account_picker_account_list);
        mAccountListView.setLayoutManager(new LinearLayoutManager(
                mAccountListView.getContext(), LinearLayoutManager.VERTICAL, false));
        mSelectedAccountView = mViewFlipper.getChildAt(ViewState.COLLAPSED_ACCOUNT_LIST)
                                       .findViewById(R.id.account_picker_selected_account);
        mDismissButton = mViewFlipper.getChildAt(ViewState.COLLAPSED_ACCOUNT_LIST)
                                 .findViewById(R.id.account_picker_dismiss_button);
        if (AccountPickerFeatureUtils.shouldHideDismissButton()) {
            mDismissButton.setVisibility(View.GONE);
        }

        setUpContinueButton(mViewFlipper.getChildAt(ViewState.NO_ACCOUNTS),
                R.string.signin_add_account_to_device);
        setUpContinueButton(mViewFlipper.getChildAt(ViewState.SIGNIN_GENERAL_ERROR),
                R.string.signin_account_picker_general_error_button);
        setUpContinueButton(mViewFlipper.getChildAt(ViewState.SIGNIN_AUTH_ERROR),
                R.string.auth_error_card_button);
    }

    /**
     * The account list view is visible when the account list is expanded.
     */
    RecyclerView getAccountListView() {
        return mAccountListView;
    }

    /**
     * The incognito interstitial view when the user clicks on incognito mode option.
     */
    View getIncognitoInterstitialView() {
        return mViewFlipper.getChildAt(ViewState.INCOGNITO_INTERSTITIAL);
    }

    /**
     * The selected account is visible when the account list is collapsed.
     */
    View getSelectedAccountView() {
        return mSelectedAccountView;
    }

    /**
     * Sets the listener of the continue button.
     */
    void setOnClickListenerOfContinueButton(OnClickListener listener) {
        for (int i = 0; i < mViewFlipper.getChildCount(); ++i) {
            ButtonCompat continueButton =
                    mViewFlipper.getChildAt(i).findViewById(R.id.account_picker_continue_as_button);
            if (continueButton != null) {
                continueButton.setOnClickListener(listener);
            }
        }
    }

    /**
     * The button to dismiss the bottom sheet.
     */
    ButtonCompat getDismissButton() {
        return mDismissButton;
    }

    /**
     * Sets the displayed view according to the given {@link ViewState}.
     */
    void setDisplayedView(@ViewState int state) {
        mViewFlipper.setDisplayedChild(state);
        View titleView = mViewFlipper.getChildAt(state).findViewById(sTitleIds[state]);
        titleView.setFocusable(true);
        titleView.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_FOCUSED);
    }

    /**
     * Updates the views related to the selected account.
     *
     * This method only updates the UI elements like text related to the selected account, it
     * does not change the visibility.
     */
    void updateSelectedAccount(DisplayableProfileData accountProfileData) {
        View view = mViewFlipper.getChildAt(ViewState.COLLAPSED_ACCOUNT_LIST);
        ExistingAccountRowViewBinder.bindAccountView(accountProfileData, mSelectedAccountView);

        ImageView rowEndImage = mSelectedAccountView.findViewById(R.id.account_selection_mark);
        rowEndImage.setImageResource(R.drawable.ic_expand_more_in_circle_24dp);

        ButtonCompat continueButton = view.findViewById(R.id.account_picker_continue_as_button);
        String continueAsButtonText = mActivity.getString(R.string.signin_promo_continue_as,
                accountProfileData.getGivenNameOrFullNameOrEmail());
        continueButton.setText(continueAsButtonText);
    }

    @Override
    public View getContentView() {
        return mContentView;
    }

    @Nullable
    @Override
    public View getToolbarView() {
        return null;
    }

    @Override
    public int getVerticalScrollOffset() {
        return 0;
    }

    @Override
    public int getPeekHeight() {
        return HeightMode.DISABLED;
    }

    @Override
    public float getFullHeightRatio() {
        return HeightMode.WRAP_CONTENT;
    }

    @Override
    public void destroy() {}

    @Override
    public int getPriority() {
        return ContentPriority.HIGH;
    }

    @Override
    public boolean swipeToDismissEnabled() {
        return true;
    }

    @Override
    public boolean handleBackPress() {
        return mBackPressListener.onBackPressed();
    }

    @Override
    public int getSheetContentDescriptionStringId() {
        // TODO(https://crbug.com/1112696): Use more specific string
        // account picker content description
        return R.string.signin_account_picker_bottom_sheet_subtitle;
    }

    @Override
    public int getSheetHalfHeightAccessibilityStringId() {
        return R.string.signin_account_picker_dialog_title;
    }

    @Override
    public int getSheetFullHeightAccessibilityStringId() {
        // TODO(https://crbug.com/1112696): Use more specific string
        // like |Open account picker bottom sheet...| when bottom sheet opens
        // after a11y meeting
        return R.string.signin_account_picker_dialog_title;
    }

    @Override
    public int getSheetClosedAccessibilityStringId() {
        // TODO(https://crbug.com/1112696): Use more specific string when the account
        // picker is closed.
        return R.string.close;
    }

    private static void setUpContinueButton(View view, @StringRes int buttonId) {
        ButtonCompat continueButton = view.findViewById(R.id.account_picker_continue_as_button);
        continueButton.setText(buttonId);
    }

    private static void checkViewFlipperChildrenAndViewStateMatch(ViewFlipper viewFlipper) {
        checkViewFlipperChildIdAndViewStateMatch(
                viewFlipper, ViewState.NO_ACCOUNTS, R.id.account_picker_state_no_account);
        checkViewFlipperChildIdAndViewStateMatch(
                viewFlipper, ViewState.COLLAPSED_ACCOUNT_LIST, R.id.account_picker_state_collapsed);
        checkViewFlipperChildIdAndViewStateMatch(
                viewFlipper, ViewState.EXPANDED_ACCOUNT_LIST, R.id.account_picker_state_expanded);
        checkViewFlipperChildIdAndViewStateMatch(viewFlipper, ViewState.SIGNIN_IN_PROGRESS,
                R.id.account_picker_state_signin_in_progress);
        checkViewFlipperChildIdAndViewStateMatch(viewFlipper, ViewState.INCOGNITO_INTERSTITIAL,
                R.id.account_picker_state_incognito_interstitial);
        checkViewFlipperChildIdAndViewStateMatch(viewFlipper, ViewState.SIGNIN_GENERAL_ERROR,
                R.id.account_picker_state_general_error);
        checkViewFlipperChildIdAndViewStateMatch(
                viewFlipper, ViewState.SIGNIN_AUTH_ERROR, R.id.account_picker_state_auth_error);
    }

    private static void checkViewFlipperChildIdAndViewStateMatch(
            ViewFlipper viewFlipper, @ViewState int viewState, @IdRes int expectedChildId) {
        if (viewFlipper.getChildAt(viewState).getId() != expectedChildId) {
            throw new IllegalArgumentException("Match failed with ViewState:" + viewState);
        }
    }
}