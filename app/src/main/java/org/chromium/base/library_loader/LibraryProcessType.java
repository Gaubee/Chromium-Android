
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/library_loader/library_loader_hooks.h

package org.chromium.base.library_loader;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LibraryProcessType.PROCESS_UNINITIALIZED, LibraryProcessType.PROCESS_BROWSER,
    LibraryProcessType.PROCESS_CHILD, LibraryProcessType.PROCESS_WEBVIEW,
    LibraryProcessType.PROCESS_WEBVIEW_CHILD, LibraryProcessType.PROCESS_WEBLAYER,
    LibraryProcessType.PROCESS_WEBLAYER_CHILD
})
@Retention(RetentionPolicy.SOURCE)
public @interface LibraryProcessType {
  /**
   * The LibraryLoad has not been initialized.
   */
  int PROCESS_UNINITIALIZED = 0;
  /**
   * Shared library is running in browser process.
   */
  int PROCESS_BROWSER = 1;
  /**
   * Shared library is running in child process.
   */
  int PROCESS_CHILD = 2;
  /**
   * Shared library is running in the app that uses webview.
   */
  int PROCESS_WEBVIEW = 3;
  /**
   * Shared library is running in child process as part of webview.
   */
  int PROCESS_WEBVIEW_CHILD = 4;
  /**
   * Shared library is running in the app that uses weblayer.
   */
  int PROCESS_WEBLAYER = 5;
  /**
   * Shared library is running in child process as part of weblayer.
   */
  int PROCESS_WEBLAYER_CHILD = 6;
}
