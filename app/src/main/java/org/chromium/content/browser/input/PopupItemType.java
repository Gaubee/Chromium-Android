
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/browser/android/select_popup.cc

package org.chromium.content.browser.input;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PopupItemType.GROUP, PopupItemType.DISABLED, PopupItemType.ENABLED
})
@Retention(RetentionPolicy.SOURCE)
public @interface PopupItemType {
  /**
   * Popup item is of type group
   */
  int GROUP = 0;
  /**
   * Popup item is disabled
   */
  int DISABLED = 1;
  /**
   * Popup item is enabled
   */
  int ENABLED = 2;
}
