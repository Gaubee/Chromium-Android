
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../weblayer/public/download.h

package org.chromium.weblayer_private;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ImplDownloadError.NO_ERROR, ImplDownloadError.SERVER_ERROR, ImplDownloadError.SSL_ERROR,
    ImplDownloadError.CONNECTIVITY_ERROR, ImplDownloadError.NO_SPACE, ImplDownloadError.FILE_ERROR,
    ImplDownloadError.CANCELLED, ImplDownloadError.OTHER_ERROR
})
@Retention(RetentionPolicy.SOURCE)
public @interface ImplDownloadError {
  int NO_ERROR = 0;
  int SERVER_ERROR = 1;
  /**
   * server unreachable,
   */
  int SSL_ERROR = 2;
  int CONNECTIVITY_ERROR = 3;
  /**
   * out, invalid request.
   */
  int NO_SPACE = 4;
  int FILE_ERROR = 5;
  /**
   * access denied, directory or filename too long, file is too large for file system, file in use,
   * too many files open at once etc...
   */
  int CANCELLED = 6;
  int OTHER_ERROR = 7;
}