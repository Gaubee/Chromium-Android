// Element.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page_state/page_state.mojom
//

package org.chromium.blink.mojom;


public final class Element extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int BlobUuid = 0;
        public static final int Bytes = 1;
        public static final int File = 2;
        public static final int DeprecatedFileSystemFile = 3;
    };
    private String mBlobUuid;
    private byte[] mBytes;
    private File mFile;
    private DeprecatedFileSystemFile mDeprecatedFileSystemFile;

    public void setBlobUuid(String blobUuid) {
        this.mTag = Tag.BlobUuid;
        this.mBlobUuid = blobUuid;
    }

    public String getBlobUuid() {
        assert this.mTag == Tag.BlobUuid;
        return this.mBlobUuid;
    }

    public void setBytes(byte[] bytes) {
        this.mTag = Tag.Bytes;
        this.mBytes = bytes;
    }

    public byte[] getBytes() {
        assert this.mTag == Tag.Bytes;
        return this.mBytes;
    }

    public void setFile(File file) {
        this.mTag = Tag.File;
        this.mFile = file;
    }

    public File getFile() {
        assert this.mTag == Tag.File;
        return this.mFile;
    }

    public void setDeprecatedFileSystemFile(DeprecatedFileSystemFile deprecatedFileSystemFile) {
        this.mTag = Tag.DeprecatedFileSystemFile;
        this.mDeprecatedFileSystemFile = deprecatedFileSystemFile;
    }

    public DeprecatedFileSystemFile getDeprecatedFileSystemFile() {
        assert this.mTag == Tag.DeprecatedFileSystemFile;
        return this.mDeprecatedFileSystemFile;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.BlobUuid: {
                
                encoder0.encode(this.mBlobUuid, offset + 8, false);
                break;
            }
            case Tag.Bytes: {
                
                encoder0.encode(this.mBytes, offset + 8, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                break;
            }
            case Tag.File: {
                
                encoder0.encode(this.mFile, offset + 8, false);
                break;
            }
            case Tag.DeprecatedFileSystemFile: {
                
                encoder0.encode(this.mDeprecatedFileSystemFile, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static Element deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final Element decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        Element result = new Element();
        switch (dataHeader.elementsOrVersion) {
            case Tag.BlobUuid: {
                
                result.mBlobUuid = decoder0.readString(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTag = Tag.BlobUuid;
                break;
            }
            case Tag.Bytes: {
                
                result.mBytes = decoder0.readBytes(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                result.mTag = Tag.Bytes;
                break;
            }
            case Tag.File: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mFile = File.decode(decoder1);
                result.mTag = Tag.File;
                break;
            }
            case Tag.DeprecatedFileSystemFile: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mDeprecatedFileSystemFile = DeprecatedFileSystemFile.decode(decoder1);
                result.mTag = Tag.DeprecatedFileSystemFile;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}