// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.privacy_sandbox;

import org.bnqkl.bfchromiun.R;

import android.content.Context;

import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ui.messages.snackbar.Snackbar;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/**
 * Shows the snackbar for Privacy Sandbox settings, allowing the user to quickly navigate there.
 */
public class PrivacySandboxSnackbarController implements SnackbarManager.SnackbarController {
    private final Context mContext;
    private final SettingsLauncher mSettingsLauncher;
    private final SnackbarManager mSnackbarManager;

    /**
     * Creates an instance of the controller given a SnackbarManager and a SettingsLauncher.
     */
    public PrivacySandboxSnackbarController(
            Context context, SnackbarManager manager, SettingsLauncher launcher) {
        ThreadUtils.assertOnUiThread();
        assert manager != null;
        mContext = context;
        mSnackbarManager = manager;
        mSettingsLauncher = launcher;
    }

    /**
     * Displays a snackbar, showing the user an option to go to Privacy Sandbox settings.
     */
    public void showSnackbar() {
        mSnackbarManager.dismissSnackbars(this);
        mSnackbarManager.showSnackbar(
                Snackbar.make(mContext.getString(R.string.privacy_sandbox_snackbar_message), this,
                                Snackbar.TYPE_ACTION, Snackbar.UMA_PRIVACY_SANDBOX_PAGE_OPEN)
                        .setAction(mContext.getString(R.string.more), null));
    }

    /**
     * Dismisses the snackbar, if it is active.
     */
    public void dismissSnackbar() {
        mSnackbarManager.dismissSnackbars(this);
    }

    // Implement SnackbarController.
    @Override
    public void onAction(Object actionData) {
        mSettingsLauncher.launchSettingsActivity(mContext, PrivacySandboxSettingsFragment.class);
    }

    @Override
    public void onDismissNoAction(Object actionData) {}
}
