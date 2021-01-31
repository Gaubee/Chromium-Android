
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../cc/input/browser_controls_state.h

package org.chromium.cc.input;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    BrowserControlsState.SHOWN, BrowserControlsState.HIDDEN, BrowserControlsState.BOTH,
    BrowserControlsState.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface BrowserControlsState {
  int SHOWN = 1;
  int HIDDEN = 2;
  int BOTH = 3;
  int MAX_VALUE = BOTH;
}
