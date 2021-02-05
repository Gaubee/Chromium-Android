// ContentColorUsage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/display_color_spaces.mojom
//

package org.chromium.gfx.mojom;

public final class ContentColorUsage {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SRGB = 0;
    public static final int WIDE_COLOR_GAMUT = 1;
    public static final int HDR = 2;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 2;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ContentColorUsage() {}
}