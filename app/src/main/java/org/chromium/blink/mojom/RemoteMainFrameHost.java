// RemoteMainFrameHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface RemoteMainFrameHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RemoteMainFrameHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteMainFrameHost, RemoteMainFrameHost.Proxy> MANAGER = RemoteMainFrameHost_Internal.MANAGER;


    void focusPage(
);



    void takeFocus(
boolean reverse);



    void updateTargetUrl(
org.chromium.url.mojom.Url url, 
UpdateTargetUrlResponse callback);

    interface UpdateTargetUrlResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void routeCloseEvent(
);


}