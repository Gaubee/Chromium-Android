
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/safe_browsing/core/common/safe_browsing_prefs.h

package org.chromium.chrome.browser.safe_browsing;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SafeBrowsingState.NO_SAFE_BROWSING, SafeBrowsingState.STANDARD_PROTECTION,
    SafeBrowsingState.ENHANCED_PROTECTION, SafeBrowsingState.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SafeBrowsingState {
  /**
   * The user is not opted into Safe Browsing.
   */
  int NO_SAFE_BROWSING = 0;
  /**
   * The user selected standard protection.
   */
  int STANDARD_PROTECTION = 1;
  /**
   * The user selected enhanced protection.
   */
  int ENHANCED_PROTECTION = 2;
  int MAX_VALUE = ENHANCED_PROTECTION;
}