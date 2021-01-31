
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/metrics/histogram_base.h

package org.chromium.base.metrics;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    JSONVerbosityLevel.JSON_VERBOSITY_LEVEL_FULL,
    JSONVerbosityLevel.JSON_VERBOSITY_LEVEL_OMIT_BUCKETS
})
@Retention(RetentionPolicy.SOURCE)
public @interface JSONVerbosityLevel {
  /**
   * The histogram is completely serialized.
   */
  int JSON_VERBOSITY_LEVEL_FULL = 0;
  /**
   * The bucket information is not serialized.
   */
  int JSON_VERBOSITY_LEVEL_OMIT_BUCKETS = 1;
}
