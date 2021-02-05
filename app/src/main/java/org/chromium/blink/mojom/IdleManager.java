// IdleManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/idle/idle_manager.mojom
//

package org.chromium.blink.mojom;


public interface IdleManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends IdleManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<IdleManager, IdleManager.Proxy> MANAGER = IdleManager_Internal.MANAGER;


    void addMonitor(
org.chromium.mojo_base.mojom.TimeDelta threshold, IdleMonitor monitor, 
AddMonitorResponse callback);

    interface AddMonitorResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, IdleState> { }


}
