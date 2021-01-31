// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.base.compat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillManager;

import org.chromium.base.StrictModeContext;
import org.chromium.base.annotations.VerifiesOnO;

/**
 * Utility class to use new APIs that were added in O (API level 26). These need to exist in a
 * separate class so that Android framework can successfully verify classes without
 * encountering the new APIs.
 */
@VerifiesOnO
@TargetApi(Build.VERSION_CODES.O)
public final class ApiHelperForO {
    private ApiHelperForO() {}

    /** See {@link Display#isWideColorGamut() }. */
    public static boolean isWideColorGamut(Display display) {
        return display.isWideColorGamut();
    }

    /** See {@link Window#setColorMode(int) }. */
    public static void setColorMode(Window window, int colorMode) {
        window.setColorMode(colorMode);
    }

    /** See {@link Configuration#isScreenWideColorGamut() }. */
    public static boolean isScreenWideColorGamut(Configuration configuration) {
        return configuration.isScreenWideColorGamut();
    }

    /** See {@link PackageManager#isInstantApp() }. */
    public static boolean isInstantApp(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    /** See {@link View#setDefaultFocusHighlightEnabled(boolean) }. */
    public static void setDefaultFocusHighlightEnabled(View view, boolean enabled) {
        view.setDefaultFocusHighlightEnabled(enabled);
    }

    /** See {@link ClipDescription#getTimestamp()}. */
    public static long getTimestamp(ClipDescription clipDescription) {
        return clipDescription.getTimestamp();
    }

    /** See {@link ApplicationInfo#splitNames}. */
    public static String[] getSplitNames(ApplicationInfo info) {
        return info.splitNames;
    }

    /** See {@link Context.createContextForSplit(String) }. */
    public static Context createContextForSplit(Context context, String name)
            throws PackageManager.NameNotFoundException {
        try (StrictModeContext ignored = StrictModeContext.allowDiskReads()) {
            return context.createContextForSplit(name);
        }
    }

    /** See {@link AutofillManager#cancel()}. */
    public static void cancelAutofillSession(Activity activity) {
        // The AutofillManager has to be retrieved from an activity context.
        // https://cs.android.com/android/platform/superproject/+/master:frameworks/base/core/java/android/app/Application.java;l=624;drc=5d123b67756dffcfdebdb936ab2de2b29c799321
        AutofillManager afm = activity.getSystemService(AutofillManager.class);
        if (afm != null) {
            afm.cancel();
        }
    }

    /** See {@link AutofillManager#notifyValueChanged(View)}. */
    public static void notifyValueChangedForAutofill(View view) {
        final AutofillManager afm = view.getContext().getSystemService(AutofillManager.class);
        if (afm != null) {
            afm.notifyValueChanged(view);
        }
    }
}
