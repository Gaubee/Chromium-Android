// RawClipboardHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/clipboard/raw_clipboard.mojom
//

package org.chromium.blink.mojom;


public interface RawClipboardHost extends org.chromium.mojo.bindings.Interface {


    
    public static final int MAX_FORMAT_SIZE = (int) 1024;



    
    public static final int MAX_DATA_SIZE = (int) 1073741824;




    public interface Proxy extends RawClipboardHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RawClipboardHost, RawClipboardHost.Proxy> MANAGER = RawClipboardHost_Internal.MANAGER;


    void readAvailableFormatNames(

ReadAvailableFormatNamesResponse callback);

    interface ReadAvailableFormatNamesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.String16[]> { }



    void read(
org.chromium.mojo_base.mojom.String16 format, 
ReadResponse callback);

    interface ReadResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigBuffer> { }



    void write(
org.chromium.mojo_base.mojom.String16 format, org.chromium.mojo_base.mojom.BigBuffer data);



    void commitWrite(
);


}
