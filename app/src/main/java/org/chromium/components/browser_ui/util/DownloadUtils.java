// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.browser_ui.util;

import org.bnqkl.bfchromiun.R;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

import androidx.core.app.NotificationManagerCompat;

import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.components.embedder_support.util.UrlConstants;

/**
 * A class containing some utility static methods.
 */
public class DownloadUtils {
    private static final int[] BYTES_STRINGS = {
            R.string.download_ui_kb, R.string.download_ui_mb, R.string.download_ui_gb};

    /**
     * Format the number of bytes into KB, MB, or GB and return the corresponding generated string.
     * @param context Context to use.
     * @param bytes   Number of bytes needed to display.
     * @return        The formatted string to be displayed.
     */
    public static String getStringForBytes(Context context, long bytes) {
        return getStringForBytes(context, BYTES_STRINGS, bytes);
    }

    /**
     * Format the number of bytes into KB, or MB, or GB and return the corresponding string
     * resource.
     * @param context Context to use.
     * @param stringSet The string resources for displaying bytes in KB, MB and GB.
     * @param bytes Number of bytes.
     * @return A formatted string to be displayed.
     */
    public static String getStringForBytes(Context context, int[] stringSet, long bytes) {
        int resourceId;
        float bytesInCorrectUnits;

        if (ConversionUtils.bytesToMegabytes(bytes) < 1) {
            resourceId = stringSet[0];
            bytesInCorrectUnits = bytes / (float) ConversionUtils.BYTES_PER_KILOBYTE;
        } else if (ConversionUtils.bytesToGigabytes(bytes) < 1) {
            resourceId = stringSet[1];
            bytesInCorrectUnits = bytes / (float) ConversionUtils.BYTES_PER_MEGABYTE;
        } else {
            resourceId = stringSet[2];
            bytesInCorrectUnits = bytes / (float) ConversionUtils.BYTES_PER_GIGABYTE;
        }

        return context.getResources().getString(resourceId, bytesInCorrectUnits);
    }

    /**
     * Adds a download to the Android DownloadManager.
     * @see android.app.DownloadManager#addCompletedDownload(String, String, boolean, String,
     * String, long, boolean)
     */
    public static long addCompletedDownload(String fileName, String description, String mimeType,
            String filePath, long fileSizeBytes, String originalUrl, String referer) {
        assert !ThreadUtils.runningOnUiThread();
        assert Build.VERSION.SDK_INT < Build.VERSION_CODES.Q
            : "addCompletedDownload is deprecated in Q, may cause crash.";
        Context context = ContextUtils.getApplicationContext();
        DownloadManager manager =
                (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        boolean useSystemNotification = !notificationManager.areNotificationsEnabled();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            // OriginalUri has to be null or non-empty http(s) scheme.
            Uri originalUri = parseOriginalUrl(originalUrl);
            Uri refererUri = TextUtils.isEmpty(referer) ? null : Uri.parse(referer);
            return manager.addCompletedDownload(fileName, description, true, mimeType, filePath,
                    fileSizeBytes, useSystemNotification, originalUri, refererUri);
        }

        return manager.addCompletedDownload(fileName, description, true, mimeType, filePath,
                fileSizeBytes, useSystemNotification);
    }

    /**
     * Parses an originating URL string and returns a valid Uri that can be inserted into
     * DownloadManager. The returned Uri has to be null or non-empty http(s) scheme.
     * @param originalUrl String representation of the originating URL.
     * @return A valid Uri that can be accepted by DownloadManager.
     */
    public static Uri parseOriginalUrl(String originalUrl) {
        Uri originalUri = TextUtils.isEmpty(originalUrl) ? null : Uri.parse(originalUrl);
        if (originalUri != null) {
            String scheme = originalUri.normalizeScheme().getScheme();
            if (scheme == null
                    || (!scheme.equals(UrlConstants.HTTPS_SCHEME)
                            && !scheme.equals(UrlConstants.HTTP_SCHEME))) {
                originalUri = null;
            }
        }
        return originalUri;
    }
}
