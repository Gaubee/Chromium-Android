
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/net/secure_dns_config.h

package org.chromium.chrome.browser.net;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SecureDnsManagementMode.NO_OVERRIDE, SecureDnsManagementMode.DISABLED_MANAGED,
    SecureDnsManagementMode.DISABLED_PARENTAL_CONTROLS
})
@Retention(RetentionPolicy.SOURCE)
public @interface SecureDnsManagementMode {
  /**
   * Chrome did not override the secure DNS settings.
   */
  int NO_OVERRIDE = 0;
  /**
   * Secure DNS was disabled due to detection of a managed environment.
   */
  int DISABLED_MANAGED = 1;
  /**
   * Secure DNS was disabled due to detection of OS-level parental controls.
   */
  int DISABLED_PARENTAL_CONTROLS = 2;
}
