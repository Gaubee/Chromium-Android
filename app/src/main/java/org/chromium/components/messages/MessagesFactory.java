// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
//
// This file is autogenerated by
//     chrome/android/features/create_stripped_java_factory.py
// Please do not change its content or use it in actual code (DO NOT SUBMIT).

package org.chromium.components.messages;

import android.animation.Animator;
import org.chromium.base.Callback;
import org.chromium.base.supplier.Supplier;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.util.AccessibilityUtil;

public class MessagesFactory {
    static public ManagedMessageDispatcher createMessageDispatcher (MessageContainer container, Supplier<Integer> messageMaxTranslation, AccessibilityUtil accessibilityUtil, Callback<Animator> animatorStartCallback) { return null; }
    static public void attachMessageDispatcher (WindowAndroid windowAndroid, ManagedMessageDispatcher messageDispatcher) { return ; }
    static public void detachMessageDispatcher (ManagedMessageDispatcher messageDispatcher) { return ; }
}
