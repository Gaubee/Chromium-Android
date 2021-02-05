// FileSystemAccessFileHandle.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_file_handle.mojom
//

package org.chromium.blink.mojom;


public interface FileSystemAccessFileHandle extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FileSystemAccessFileHandle, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileSystemAccessFileHandle, FileSystemAccessFileHandle.Proxy> MANAGER = FileSystemAccessFileHandle_Internal.MANAGER;


    void getPermissionStatus(
boolean writable, 
GetPermissionStatusResponse callback);

    interface GetPermissionStatusResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermission(
boolean writable, 
RequestPermissionResponse callback);

    interface RequestPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, Integer> { }



    void asBlob(

AsBlobResponse callback);

    interface AsBlobResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<FileSystemAccessError, org.chromium.mojo_base.mojom.FileInfo, SerializedBlob> { }



    void createFileWriter(
boolean keepExistingData, boolean autoClose, 
CreateFileWriterResponse callback);

    interface CreateFileWriterResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, FileSystemAccessFileWriter> { }



    void isSameEntry(
FileSystemAccessTransferToken other, 
IsSameEntryResponse callback);

    interface IsSameEntryResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, Boolean> { }



    void transfer(
org.chromium.mojo.bindings.InterfaceRequest<FileSystemAccessTransferToken> token);


}
