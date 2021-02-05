// DedicatedWorkerHostFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/dedicated_worker_host_factory.mojom
//

package org.chromium.blink.mojom;


public interface DedicatedWorkerHostFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DedicatedWorkerHostFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DedicatedWorkerHostFactory, DedicatedWorkerHostFactory.Proxy> MANAGER = DedicatedWorkerHostFactory_Internal.MANAGER;


    void createWorkerHost(
DedicatedWorkerToken token, org.chromium.mojo.bindings.InterfaceRequest<BrowserInterfaceBroker> browserInterfaceBroker, 
CreateWorkerHostResponse callback);

    interface CreateWorkerHostResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.network.mojom.CrossOriginEmbedderPolicy> { }



    void createWorkerHostAndStartScriptLoad(
DedicatedWorkerToken token, org.chromium.url.mojom.Url scriptUrl, int credentialsMode, FetchClientSettingsObject outsideFetchClientSettingsObject, BlobUrlToken blobUrlToken, DedicatedWorkerHostFactoryClient client);


}
