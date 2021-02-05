// NetLogProxySink.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/net_log.mojom
//

package org.chromium.network.mojom;


public interface NetLogProxySink extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetLogProxySink, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetLogProxySink, NetLogProxySink.Proxy> MANAGER = NetLogProxySink_Internal.MANAGER;


    void addEntry(
int type, int sourceType, int sourceId, org.chromium.mojo_base.mojom.TimeTicks sourceStartTime, int phase, org.chromium.mojo_base.mojom.TimeTicks time, org.chromium.mojo_base.mojom.Value params);


}
