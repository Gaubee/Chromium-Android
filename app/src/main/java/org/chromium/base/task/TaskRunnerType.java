
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/task_scheduler/task_runner_android.h

package org.chromium.base.task;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TaskRunnerType.BASE, TaskRunnerType.SEQUENCED, TaskRunnerType.SINGLE_THREAD
})
@Retention(RetentionPolicy.SOURCE)
public @interface TaskRunnerType {
  int BASE = 0;
  int SEQUENCED = 1;
  int SINGLE_THREAD = 2;
}
