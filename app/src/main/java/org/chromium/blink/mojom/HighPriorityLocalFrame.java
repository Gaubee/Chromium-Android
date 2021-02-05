// HighPriorityLocalFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface HighPriorityLocalFrame extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends HighPriorityLocalFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HighPriorityLocalFrame, HighPriorityLocalFrame.Proxy> MANAGER = HighPriorityLocalFrame_Internal.MANAGER;


    void dispatchBeforeUnload(
boolean isReload, 
DispatchBeforeUnloadResponse callback);

    interface DispatchBeforeUnloadResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, org.chromium.mojo_base.mojom.TimeTicks, org.chromium.mojo_base.mojom.TimeTicks> { }


}
