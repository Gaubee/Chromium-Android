// FileSystemManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/filesystem/file_system.mojom
//

package org.chromium.blink.mojom;


public interface FileSystemManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FileSystemManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileSystemManager, FileSystemManager.Proxy> MANAGER = FileSystemManager_Internal.MANAGER;


    void open(
org.chromium.url.internal.mojom.Origin origin, int fileSystemType, 
OpenResponse callback);

    interface OpenResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<String, org.chromium.url.mojom.Url, Integer> { }



    void resolveUrl(
org.chromium.url.mojom.Url filesystemUrl, 
ResolveUrlResponse callback);

    interface ResolveUrlResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<FileSystemInfo, org.chromium.mojo_base.mojom.FilePath, Boolean, Integer> { }



    void move(
org.chromium.url.mojom.Url srcPath, org.chromium.url.mojom.Url destPath, 
MoveResponse callback);

    interface MoveResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void copy(
org.chromium.url.mojom.Url srcPath, org.chromium.url.mojom.Url destPath, 
CopyResponse callback);

    interface CopyResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void remove(
org.chromium.url.mojom.Url path, boolean recursive, 
RemoveResponse callback);

    interface RemoveResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void readMetadata(
org.chromium.url.mojom.Url path, 
ReadMetadataResponse callback);

    interface ReadMetadataResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.mojo_base.mojom.FileInfo, Integer> { }



    void create(
org.chromium.url.mojom.Url path, boolean exclusive, boolean isDirectory, boolean recursive, 
CreateResponse callback);

    interface CreateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void exists(
org.chromium.url.mojom.Url path, boolean isDirectory, 
ExistsResponse callback);

    interface ExistsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void readDirectory(
org.chromium.url.mojom.Url path, FileSystemOperationListener listener);



    void readDirectorySync(
org.chromium.url.mojom.Url path, 
ReadDirectorySyncResponse callback);

    interface ReadDirectorySyncResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.filesystem.mojom.DirectoryEntry[], Integer> { }



    void write(
org.chromium.url.mojom.Url filePath, String blobUuid, long position, org.chromium.mojo.bindings.InterfaceRequest<FileSystemCancellableOperation> opReceiver, FileSystemOperationListener listener);



    void writeSync(
org.chromium.url.mojom.Url filePath, String blobUuid, long position, 
WriteSyncResponse callback);

    interface WriteSyncResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Long, Integer> { }



    void truncate(
org.chromium.url.mojom.Url filePath, long length, org.chromium.mojo.bindings.InterfaceRequest<FileSystemCancellableOperation> opReceiver, 
TruncateResponse callback);

    interface TruncateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void truncateSync(
org.chromium.url.mojom.Url filePath, long length, 
TruncateSyncResponse callback);

    interface TruncateSyncResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void createSnapshotFile(
org.chromium.url.mojom.Url filePath, 
CreateSnapshotFileResponse callback);

    interface CreateSnapshotFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<org.chromium.mojo_base.mojom.FileInfo, org.chromium.mojo_base.mojom.FilePath, Integer, ReceivedSnapshotListener> { }



    void getPlatformPath(
org.chromium.url.mojom.Url filePath, 
GetPlatformPathResponse callback);

    interface GetPlatformPathResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.FilePath> { }


}