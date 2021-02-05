// PointerType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webpreferences/web_preferences.mojom
//

package org.chromium.blink.mojom;

public final class PointerType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int POINTER_NONE = 1;
    public static final int POINTER_FIRST_TYPE = 1;
    public static final int POINTER_COARSE_TYPE = 2;
    public static final int POINTER_FINE_TYPE = 4;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 1:
            case 2:
            case 4:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private PointerType() {}
}