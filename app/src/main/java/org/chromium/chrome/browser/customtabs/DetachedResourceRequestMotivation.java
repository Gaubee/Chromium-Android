
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/customtabs/detached_resource_request.h

package org.chromium.chrome.browser.customtabs;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DetachedResourceRequestMotivation.PARALLEL_REQUEST,
    DetachedResourceRequestMotivation.RESOURCE_PREFETCH
})
@Retention(RetentionPolicy.SOURCE)
public @interface DetachedResourceRequestMotivation {
  int PARALLEL_REQUEST = 0;
  int RESOURCE_PREFETCH = 1;
}
