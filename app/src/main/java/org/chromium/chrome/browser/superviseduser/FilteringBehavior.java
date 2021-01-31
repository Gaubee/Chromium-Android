
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/supervised_user/supervised_user_url_filter.h

package org.chromium.chrome.browser.superviseduser;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    FilteringBehavior.ALLOW, FilteringBehavior.WARN, FilteringBehavior.BLOCK,
    FilteringBehavior.INVALID
})
@Retention(RetentionPolicy.SOURCE)
public @interface FilteringBehavior {
  int ALLOW = 0;
  int WARN = 1;
  int BLOCK = 2;
  int INVALID = 3;
}
