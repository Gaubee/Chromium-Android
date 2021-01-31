
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/banners/app_banner_settings_helper.h

package org.chromium.chrome.browser.banners;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AppMenuVerbiage.APP_MENU_OPTION_UNKNOWN, AppMenuVerbiage.APP_MENU_OPTION_MIN,
    AppMenuVerbiage.APP_MENU_OPTION_ADD_TO_HOMESCREEN, AppMenuVerbiage.APP_MENU_OPTION_INSTALL,
    AppMenuVerbiage.APP_MENU_OPTION_MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface AppMenuVerbiage {
  int APP_MENU_OPTION_UNKNOWN = 0;
  int APP_MENU_OPTION_MIN = APP_MENU_OPTION_UNKNOWN;
  int APP_MENU_OPTION_ADD_TO_HOMESCREEN = 1;
  int APP_MENU_OPTION_INSTALL = 2;
  int APP_MENU_OPTION_MAX = APP_MENU_OPTION_INSTALL;
}
