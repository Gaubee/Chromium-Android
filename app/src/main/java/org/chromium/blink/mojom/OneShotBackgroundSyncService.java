// OneShotBackgroundSyncService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_sync/background_sync.mojom
//

package org.chromium.blink.mojom;


public interface OneShotBackgroundSyncService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends OneShotBackgroundSyncService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<OneShotBackgroundSyncService, OneShotBackgroundSyncService.Proxy> MANAGER = OneShotBackgroundSyncService_Internal.MANAGER;


    void register(
SyncRegistrationOptions options, long serviceWorkerRegistrationId, 
RegisterResponse callback);

    interface RegisterResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, SyncRegistrationOptions> { }



    void didResolveRegistration(
BackgroundSyncRegistrationInfo registrationInfo);



    void getRegistrations(
long serviceWorkerRegistrationId, 
GetRegistrationsResponse callback);

    interface GetRegistrationsResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, SyncRegistrationOptions[]> { }


}
