// CertVerifierService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cert_verifier_service.mojom
//

package org.chromium.cert_verifier.mojom;


public interface CertVerifierService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CertVerifierService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CertVerifierService, CertVerifierService.Proxy> MANAGER = CertVerifierService_Internal.MANAGER;


    void enableNetworkAccess(
org.chromium.network.mojom.UrlLoaderFactory urlLoaderFactory, UrlLoaderFactoryConnector reconnector);



    void verify(
RequestParams params, CertVerifierRequest certVerifierRequest);



    void setConfig(
CertVerifierConfig config);


}
