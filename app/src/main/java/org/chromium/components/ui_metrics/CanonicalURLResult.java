
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ui_metrics/canonical_url_share_metrics_types.h

package org.chromium.components.ui_metrics;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CanonicalURLResult.FAILED_VISIBLE_URL_NOT_HTTPS,
    CanonicalURLResult.FAILED_CANONICAL_URL_NOT_HTTPS_DEPRECATED,
    CanonicalURLResult.FAILED_NO_CANONICAL_URL_DEFINED,
    CanonicalURLResult.FAILED_CANONICAL_URL_INVALID,
    CanonicalURLResult.SUCCESS_CANONICAL_URL_DIFFERENT_FROM_VISIBLE,
    CanonicalURLResult.SUCCESS_CANONICAL_URL_SAME_AS_VISIBLE,
    CanonicalURLResult.SUCCESS_CANONICAL_URL_NOT_HTTPS,
    CanonicalURLResult.CANONICAL_URL_RESULT_COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface CanonicalURLResult {
  /**
   * The canonical URL retrieval failed because the visible URL is not HTTPS.
   */
  int FAILED_VISIBLE_URL_NOT_HTTPS = 0;
  /**
   * Deprecated.
   */
  int FAILED_CANONICAL_URL_NOT_HTTPS_DEPRECATED = 1;
  /**
   * The canonical URL retrieval failed because the page did not define one.
   */
  int FAILED_NO_CANONICAL_URL_DEFINED = 2;
  /**
   * The canonical URL retrieval failed because the page's canonical URL was invalid.
   */
  int FAILED_CANONICAL_URL_INVALID = 3;
  /**
   * The canonical URL retrieval succeeded. The retrieved canonical URL is different from the
   * visible URL.
   */
  int SUCCESS_CANONICAL_URL_DIFFERENT_FROM_VISIBLE = 4;
  /**
   * The canonical URL retrieval succeeded. The retrieved canonical URL is the same as the visible
   * URL.
   */
  int SUCCESS_CANONICAL_URL_SAME_AS_VISIBLE = 5;
  /**
   * The canonical URL retrieval succeeded. The canonical URL is not HTTPS (but the visible URL is).
   */
  int SUCCESS_CANONICAL_URL_NOT_HTTPS = 6;
  /**
   * The count of canonical URL results. This must be the last item in the enum.
   */
  int CANONICAL_URL_RESULT_COUNT = 7;
}
