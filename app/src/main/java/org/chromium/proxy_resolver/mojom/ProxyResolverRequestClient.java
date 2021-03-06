// ProxyResolverRequestClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/proxy_resolver/public/mojom/proxy_resolver.mojom
//

package org.chromium.proxy_resolver.mojom;


public interface ProxyResolverRequestClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ProxyResolverRequestClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ProxyResolverRequestClient, ProxyResolverRequestClient.Proxy> MANAGER = ProxyResolverRequestClient_Internal.MANAGER;


    void reportResult(
int error, ProxyInfo proxyInfo);



    void alert(
String error);



    void onError(
int lineNumber, String error);



    void resolveDns(
String host, int operation, org.chromium.network.mojom.NetworkIsolationKey networkIsolationKey, HostResolverRequestClient client);


}
