// NetLogProxySource.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/net_log.mojom
//

package org.chromium.network.mojom;


public interface NetLogProxySource extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetLogProxySource, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetLogProxySource, NetLogProxySource.Proxy> MANAGER = NetLogProxySource_Internal.MANAGER;


    void updateCaptureModes(
int modes);


}
