// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.prefs;

import android.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.NativeMethods;

/** PrefService provides read and write access to native PrefService. */
public class PrefService {
    private long mNativePrefServiceAndroid;

    @CalledByNative
    private static PrefService create(long nativePrefServiceAndroid) {
        return new PrefService(nativePrefServiceAndroid);
    }

    @CalledByNative
    private void clearNativePtr() {
        mNativePrefServiceAndroid = 0;
    }

    @VisibleForTesting
    PrefService(long nativePrefServiceAndroid) {
        mNativePrefServiceAndroid = nativePrefServiceAndroid;
    }

    /**
     * @param preference The name of the preference.
     */
    public void clearPref(@NonNull String preference) {
        PrefServiceJni.get().clearPref(mNativePrefServiceAndroid, preference);
    }

    /**
     * @param preference The name of the preference.
     * @return Whether the specified preference is enabled.
     */
    public boolean getBoolean(@NonNull String preference) {
        return PrefServiceJni.get().getBoolean(mNativePrefServiceAndroid, preference);
    }

    /**
     * @param preference The name of the preference.
     * @param value The value the specified preference will be set to.
     */
    public void setBoolean(@NonNull String preference, boolean value) {
        PrefServiceJni.get().setBoolean(mNativePrefServiceAndroid, preference, value);
    }

    /**
     * @param preference The name of the preference.
     * @return value The value of the specified preference.
     */
    public int getInteger(@NonNull String preference) {
        return PrefServiceJni.get().getInteger(mNativePrefServiceAndroid, preference);
    }

    /**
     * @param preference The name of the preference.
     * @param value The value the specified preference will be set to.
     */
    public void setInteger(@NonNull String preference, int value) {
        PrefServiceJni.get().setInteger(mNativePrefServiceAndroid, preference, value);
    }

    /**
     * @param preference The name of the preference.
     * @return value The value of the specified preference.
     */
    @NonNull
    public String getString(@NonNull String preference) {
        return PrefServiceJni.get().getString(mNativePrefServiceAndroid, preference);
    }

    /**
     * @param preference The name of the preference.
     * @param value The value the specified preference will be set to.
     */
    public void setString(@NonNull String preference, @NonNull String value) {
        PrefServiceJni.get().setString(mNativePrefServiceAndroid, preference, value);
    }

    /**
     * @param preference The name of the preference.
     * @return Whether the specified preference is managed.
     */
    public boolean isManagedPreference(@NonNull String preference) {
        return PrefServiceJni.get().isManagedPreference(mNativePrefServiceAndroid, preference);
    }

    @NativeMethods
    interface Natives {
        void clearPref(long nativePrefServiceAndroid, String preference);
        boolean getBoolean(long nativePrefServiceAndroid, String preference);
        void setBoolean(long nativePrefServiceAndroid, String preference, boolean value);
        int getInteger(long nativePrefServiceAndroid, String preference);
        void setInteger(long nativePrefServiceAndroid, String preference, int value);
        String getString(long nativePrefServiceAndroid, String preference);
        void setString(long nativePrefServiceAndroid, String preference, String value);
        boolean isManagedPreference(long nativePrefServiceAndroid, String preference);
    }
}
