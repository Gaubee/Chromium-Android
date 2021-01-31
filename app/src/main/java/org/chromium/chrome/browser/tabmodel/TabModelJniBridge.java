// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.tabmodel;

import android.annotation.NonNull;
import android.annotation.Nullable;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabLaunchType;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.Origin;

/**
 * Bridges between the C++ and Java {@link TabModel} interfaces.
 */
public abstract class TabModelJniBridge implements TabModel {
    private final boolean mIsIncognito;

    /** Native TabModelJniBridge pointer, which will be set by {@link #initializeNative()}. */
    private long mNativeTabModelJniBridge;

    /**
     * Whether this tab model is part of a tabbed activity.
     * This is consumed by Sync as part of restoring sync data from a previous session.
     */
    private final boolean mIsTabbedActivityForSync;

    public TabModelJniBridge(@NonNull Profile profile, boolean isTabbedActivity) {
        mIsIncognito = profile.isOffTheRecord();
        mIsTabbedActivityForSync = isTabbedActivity;
    }

    /** Initializes the native-side counterpart to this class. */
    protected void initializeNative(Profile profile) {
        assert mNativeTabModelJniBridge == 0;
        mNativeTabModelJniBridge = TabModelJniBridgeJni.get().init(
                TabModelJniBridge.this, profile, mIsTabbedActivityForSync);
    }

    /** @return Whether the native-side pointer has been initialized. */
    public boolean isNativeInitialized() {
        return mNativeTabModelJniBridge != 0;
    }

    @Override
    public void destroy() {
        if (isNativeInitialized()) {
            // This will invalidate all other native references to this object in child classes.
            TabModelJniBridgeJni.get().destroy(mNativeTabModelJniBridge, TabModelJniBridge.this);
            mNativeTabModelJniBridge = 0;
        }
    }

    @Override
    public boolean isIncognito() {
        return mIsIncognito;
    }

    @Override
    public Profile getProfile() {
        assert isNativeInitialized();
        return TabModelJniBridgeJni.get().getProfileAndroid(
                mNativeTabModelJniBridge, TabModelJniBridge.this);
    }

    /** Broadcast a native-side notification that all tabs are now loaded from storage. */
    public void broadcastSessionRestoreComplete() {
        assert isNativeInitialized();
        TabModelJniBridgeJni.get().broadcastSessionRestoreComplete(
                mNativeTabModelJniBridge, TabModelJniBridge.this);
    }

    /**
     * Called by subclasses when a Tab is added to the TabModel.
     * @param tab Tab being added to the model.
     */
    protected void tabAddedToModel(Tab tab) {
        if (isNativeInitialized()) {
            TabModelJniBridgeJni.get().tabAddedToModel(
                    mNativeTabModelJniBridge, TabModelJniBridge.this, tab);
        }
    }

    /**
     * Sets the TabModel's index.
     * @param index Index of the Tab to select.
     */
    @CalledByNative
    private void setIndex(int index) {
        TabModelUtils.setIndex(this, index);
    }

    @Override
    @CalledByNative
    public abstract Tab getTabAt(int index);

    /**
     * Closes the Tab at a particular index.
     * @param index Index of the tab to close.
     * @return Whether the was successfully closed.
     */
    @CalledByNative
    protected abstract boolean closeTabAt(int index);

    /**
     * Returns a tab creator for this {@link TabModel}.
     *
     * Please note that, the {@link TabCreator} and {@TabModelImpl} are separate instances for
     * {@link ChromeTabbedActivity} and {@link CustomTabActivity} across both regular and Incognito
     * modes which allows us to pass the boolean directly.
     *
     * @param incognito A boolean to indicate whether to return IncognitoTabCreator or
     *         RegularTabCreator.
     */
    protected abstract TabCreator getTabCreator(boolean incognito);

    /**
     * Creates a Tab with the given WebContents.
     * @param parent      The parent tab that creates the new tab.
     * @param profile     The profile for which to create the new tab.
     * @param webContents A {@link WebContents} object.
     * @return Whether or not the Tab was successfully created.
     */
    @CalledByNative
    protected abstract boolean createTabWithWebContents(
            Tab parent, Profile profile, WebContents webContents);

    @CalledByNative
    protected abstract void openNewTab(Tab parent, String url, @Nullable Origin initiatorOrigin,
            String extraHeaders, ResourceRequestBody postData, int disposition,
            boolean persistParentage, boolean isRendererInitiated);

    /**
     * Creates a Tab with the given WebContents for DevTools.
     * @param url URL to show.
     */
    @CalledByNative
    protected Tab createNewTabForDevTools(String url) {
        return getTabCreator(/*incognito=*/false)
                .createNewTab(new LoadUrlParams(url), TabLaunchType.FROM_CHROME_UI, null);
    }

    @Override
    @CalledByNative
    public abstract int getCount();

    @Override
    @CalledByNative
    public abstract int index();

    /** @return Whether or not a sync session is currently being restored. */
    @CalledByNative
    protected abstract boolean isSessionRestoreInProgress();

    @CalledByNative
    @Override
    public abstract boolean isActiveModel();

    @Override
    public abstract void setActive(boolean active);

    @NativeMethods
    interface Natives {
        long init(TabModelJniBridge caller, Profile profile, boolean isTabbedActivity);
        Profile getProfileAndroid(long nativeTabModelJniBridge, TabModelJniBridge caller);
        void broadcastSessionRestoreComplete(
                long nativeTabModelJniBridge, TabModelJniBridge caller);
        void destroy(long nativeTabModelJniBridge, TabModelJniBridge caller);
        void tabAddedToModel(long nativeTabModelJniBridge, TabModelJniBridge caller, Tab tab);
    }
}
