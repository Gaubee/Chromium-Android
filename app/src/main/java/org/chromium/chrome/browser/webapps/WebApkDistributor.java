
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/webapk/webapk_types.h

package org.chromium.chrome.browser.webapps;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebApkDistributor.BROWSER, WebApkDistributor.DEVICE_POLICY, WebApkDistributor.OTHER
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebApkDistributor {
  int BROWSER = 0;
  int DEVICE_POLICY = 1;
  int OTHER = 2;
}
