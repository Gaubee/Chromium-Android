
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/metrics.h

package org.chromium.chrome.browser.autofill_assistant.metrics;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    OnBoarding.OB_SHOWN, OnBoarding.OB_NOT_SHOWN, OnBoarding.OB_ACCEPTED, OnBoarding.OB_CANCELLED,
    OnBoarding.OB_NO_ANSWER, OnBoarding.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface OnBoarding {
  int OB_SHOWN = 0;
  int OB_NOT_SHOWN = 1;
  int OB_ACCEPTED = 2;
  int OB_CANCELLED = 3;
  int OB_NO_ANSWER = 4;
  int MAX_VALUE = OB_NO_ANSWER;
}
