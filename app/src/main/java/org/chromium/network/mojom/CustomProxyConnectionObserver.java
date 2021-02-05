// CustomProxyConnectionObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;


public interface CustomProxyConnectionObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CustomProxyConnectionObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CustomProxyConnectionObserver, CustomProxyConnectionObserver.Proxy> MANAGER = CustomProxyConnectionObserver_Internal.MANAGER;


    void onFallback(
org.chromium.proxy_resolver.mojom.ProxyServer badProxy, int netError);



    void onTunnelHeadersReceived(
org.chromium.proxy_resolver.mojom.ProxyServer proxyServer, HttpResponseHeaders responseHeaders);


}
