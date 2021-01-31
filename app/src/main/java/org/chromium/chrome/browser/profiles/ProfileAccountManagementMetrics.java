
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/profiles/profile_metrics.h

package org.chromium.chrome.browser.profiles;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ProfileAccountManagementMetrics.VIEW, ProfileAccountManagementMetrics.ADD_ACCOUNT,
    ProfileAccountManagementMetrics.GO_INCOGNITO,
    ProfileAccountManagementMetrics.CLICK_PRIMARY_ACCOUNT,
    ProfileAccountManagementMetrics.CLICK_SECONDARY_ACCOUNT,
    ProfileAccountManagementMetrics.TOGGLE_SIGNOUT, ProfileAccountManagementMetrics.SIGNOUT_SIGNOUT,
    ProfileAccountManagementMetrics.SIGNOUT_CANCEL,
    ProfileAccountManagementMetrics.DIRECT_ADD_ACCOUNT, ProfileAccountManagementMetrics.NUM_METRICS
})
@Retention(RetentionPolicy.SOURCE)
public @interface ProfileAccountManagementMetrics {
  /**
   * User arrived at the Account management screen.
   */
  int VIEW = 0;
  /**
   * User arrived at the Account management screen, and clicked Add account.
   */
  int ADD_ACCOUNT = 1;
  /**
   * User arrived at the Account management screen, and clicked Go incognito.
   */
  int GO_INCOGNITO = 2;
  /**
   * User arrived at the Account management screen, and clicked on primary.
   */
  int CLICK_PRIMARY_ACCOUNT = 3;
  /**
   * User arrived at the Account management screen, and clicked on secondary.
   */
  int CLICK_SECONDARY_ACCOUNT = 4;
  /**
   * User arrived at the Account management screen, toggled Chrome signout.
   */
  int TOGGLE_SIGNOUT = 5;
  /**
   * User toggled Chrome signout, and clicked Signout.
   */
  int SIGNOUT_SIGNOUT = 6;
  /**
   * User toggled Chrome signout, and clicked Cancel.
   */
  int SIGNOUT_CANCEL = 7;
  /**
   * User arrived at the android Account management screen directly from some Gaia requests.
   */
  int DIRECT_ADD_ACCOUNT = 8;
  int NUM_METRICS = 9;
}
