
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/tab_android.h

package org.chromium.chrome.browser;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TabLoadStatus.PAGE_LOAD_FAILED, TabLoadStatus.DEFAULT_PAGE_LOAD,
    TabLoadStatus.PARTIAL_PRERENDERED_PAGE_LOAD, TabLoadStatus.FULL_PRERENDERED_PAGE_LOAD
})
@Retention(RetentionPolicy.SOURCE)
public @interface TabLoadStatus {
  int PAGE_LOAD_FAILED = 0;
  int DEFAULT_PAGE_LOAD = 1;
  int PARTIAL_PRERENDERED_PAGE_LOAD = 2;
  int FULL_PRERENDERED_PAGE_LOAD = 3;
}
