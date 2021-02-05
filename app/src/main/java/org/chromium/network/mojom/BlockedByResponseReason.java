// BlockedByResponseReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/blocked_by_response_reason.mojom
//

package org.chromium.network.mojom;

public final class BlockedByResponseReason {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int COEP_FRAME_RESOURCE_NEEDS_COEP_HEADER = 0;
    public static final int COOP_SANDBOXED_I_FRAME_CANNOT_NAVIGATE_TO_COOP_PAGE = 1;
    public static final int CORP_NOT_SAME_ORIGIN = 2;
    public static final int CORP_NOT_SAME_ORIGIN_AFTER_DEFAULTED_TO_SAME_ORIGIN_BY_COEP = 3;
    public static final int CORP_NOT_SAME_SITE = 4;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private BlockedByResponseReason() {}
}