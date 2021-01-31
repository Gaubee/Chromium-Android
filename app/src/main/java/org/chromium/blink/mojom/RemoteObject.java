// RemoteObject.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/remote_objects/remote_objects.mojom
//

package org.chromium.blink.mojom;


public interface RemoteObject extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends RemoteObject, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteObject, RemoteObject.Proxy> MANAGER = RemoteObject_Internal.MANAGER;


    void hasMethod(
String name, 
HasMethodResponse callback);

    interface HasMethodResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getMethods(

GetMethodsResponse callback);

    interface GetMethodsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<String[]> { }



    void invokeMethod(
String name, RemoteInvocationArgument[] arguments, 
InvokeMethodResponse callback);

    interface InvokeMethodResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<RemoteInvocationResult> { }



    void notifyReleasedObject(
);


}
