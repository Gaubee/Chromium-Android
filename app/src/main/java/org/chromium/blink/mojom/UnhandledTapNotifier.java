// UnhandledTapNotifier.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/unhandled_tap_notifier/unhandled_tap_notifier.mojom
//

package org.chromium.blink.mojom;


public interface UnhandledTapNotifier extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UnhandledTapNotifier, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UnhandledTapNotifier, UnhandledTapNotifier.Proxy> MANAGER = UnhandledTapNotifier_Internal.MANAGER;


    void showUnhandledTapUiIfNeeded(
UnhandledTapInfo unhandledTapInfo);


}