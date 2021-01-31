
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/linker/modern_linker_jni.h

package org.chromium.base.library_loader;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    RelroSharingStatus.NOT_ATTEMPTED, RelroSharingStatus.SHARED, RelroSharingStatus.NOT_IDENTICAL,
    RelroSharingStatus.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface RelroSharingStatus {
  int NOT_ATTEMPTED = 0;
  int SHARED = 1;
  int NOT_IDENTICAL = 2;
  int COUNT = 3;
}
