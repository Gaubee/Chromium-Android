// GetAllMatchedEntriesResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;


public final class GetAllMatchedEntriesResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Status = 0;
        public static final int Entries = 1;
    };
    private int mStatus;
    private CacheEntry[] mEntries;

    public void setStatus(int status) {
        this.mTag = Tag.Status;
        this.mStatus = status;
    }

    public int getStatus() {
        assert this.mTag == Tag.Status;
        return this.mStatus;
    }

    public void setEntries(CacheEntry[] entries) {
        this.mTag = Tag.Entries;
        this.mEntries = entries;
    }

    public CacheEntry[] getEntries() {
        assert this.mTag == Tag.Entries;
        return this.mEntries;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Status: {
                
                encoder0.encode(this.mStatus, offset + 8);
                break;
            }
            case Tag.Entries: {
                
                if (this.mEntries == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.mEntries.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mEntries.length; ++i0) {
                        
                        encoder1.encode(this.mEntries[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }

    public static GetAllMatchedEntriesResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final GetAllMatchedEntriesResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        GetAllMatchedEntriesResult result = new GetAllMatchedEntriesResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Status: {
                
                result.mStatus = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    CacheStorageError.validate(result.mStatus);
                result.mTag = Tag.Status;
                break;
            }
            case Tag.Entries: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mEntries = new CacheEntry[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.mEntries[i1] = CacheEntry.decode(decoder2);
                    }
                }
                result.mTag = Tag.Entries;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}