// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.ui.default_browser_promo;

import android.app.Activity;
import android.content.pm.ResolveInfo;

import android.annotation.IntDef;

import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.preferences.ChromePreferenceKeys;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.ui.base.WindowAndroid;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A utility class providing information regarding states of default browser.
 */
public class DefaultBrowserPromoUtils {
    @IntDef({DefaultBrowserState.CHROME_DEFAULT, DefaultBrowserState.NO_DEFAULT,
            DefaultBrowserState.OTHER_DEFAULT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DefaultBrowserState {
        int NO_DEFAULT = 0;
        int OTHER_DEFAULT = 1;
        /**
         * CHROME_DEFAULT means the currently running Chrome as opposed to
         * #isCurrentDefaultBrowserChrome() which looks for any Chrome.
         */
        int CHROME_DEFAULT = 2;
        int NUM_ENTRIES = 3;
    }

    /**
     * Determine whether a promo dialog should be displayed or not. And prepare related logic to
     * launch promo if a promo dialog has been decided to display.
     *
     * @param activity The context.
     * @param windowAndroid The {@link WindowAndroid} for sending an intent.
     * @return True if promo dialog will be displayed.
     */
    public static boolean prepareLaunchPromoIfNeeded(
            Activity activity, WindowAndroid windowAndroid) {
        DefaultBrowserPromoDeps deps = DefaultBrowserPromoDeps.getInstance();
        if (!shouldShowPromo(deps, activity)) return false;
        deps.incrementPromoCount();
        deps.recordPromoTime();
        DefaultBrowserPromoManager manager = new DefaultBrowserPromoManager(
                activity, windowAndroid, deps.getCurrentDefaultBrowserState());
        manager.promoByRoleManager();
        return true;
    }

    /**
     * This decides whether the dialog should be promoed.
     * Returns false if any of following criteria is met:
     *      1. A promo dialog has been displayed before.
     *      2. Not enough sessions have been started before.
     *      3. Any chrome, including pre-stable, has been set as default.
     *      4. On Chrome stable while no default browser is set and multiple chrome channels
     *         are installed.
     *      5. Less than the promo interval if re-promoing.
     *      6. A browser other than chrome channel is default and default app setting is not
     *         available in the current system.
     */
    static boolean shouldShowPromo(DefaultBrowserPromoDeps deps, Activity activity) {
        if (!deps.isFeatureEnabled() || !deps.isRoleAvailable(activity)) {
            return false;
        }
        // Criteria 1, 2, 5
        if (deps.getPromoCount() >= deps.getMaxPromoCount()
                || deps.getSessionCount() < deps.getMinSessionCount()
                || deps.getLastPromoInterval() < deps.getMinPromoInterval()) {
            return false;
        }

        ResolveInfo info = deps.getDefaultWebBrowserActivityResolveInfo();
        if (info == null) {
            return false;
        }

        int state = deps.getCurrentDefaultBrowserState(info);
        if (state == DefaultBrowserState.CHROME_DEFAULT) {
            return false;
        } else if (state == DefaultBrowserState.NO_DEFAULT) {
            // Criteria 4
            return !deps.isChromeStable() || !deps.isChromePreStableInstalled();
        } else { // other default
            // Criteria 3
            return !deps.isCurrentDefaultBrowserChrome(info);
        }
    }

    /**
     * Increment session count for triggering feature in the future.
     */
    public static void incrementSessionCount() {
        if (!ChromeFeatureList.isEnabled(ChromeFeatureList.ANDROID_DEFAULT_BROWSER_PROMO)) return;
        SharedPreferencesManager.getInstance().incrementInt(
                ChromePreferenceKeys.DEFAULT_BROWSER_PROMO_SESSION_COUNT);
    }
}