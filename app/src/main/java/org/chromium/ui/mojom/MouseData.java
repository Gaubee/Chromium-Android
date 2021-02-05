// MouseData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/events/mojom/event.mojom
//

package org.chromium.ui.mojom;


public final class MouseData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int changedButtonFlags;
    public LocationData location;
    public PointerDetails pointerDetails;
    public org.chromium.gfx.mojom.Vector2d wheelOffset;
    public org.chromium.gfx.mojom.Vector2d tick120ths;

    private MouseData(int version) {
        super(STRUCT_SIZE, version);
    }

    public MouseData() {
        this(0);
    }

    public static MouseData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MouseData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static MouseData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MouseData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MouseData(elementsOrVersion);
                {
                    
                result.changedButtonFlags = decoder0.readInt(8);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.location = LocationData.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.pointerDetails = PointerDetails.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.wheelOffset = org.chromium.gfx.mojom.Vector2d.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.tick120ths = org.chromium.gfx.mojom.Vector2d.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.changedButtonFlags, 8);
        
        encoder0.encode(this.location, 16, false);
        
        encoder0.encode(this.pointerDetails, 24, false);
        
        encoder0.encode(this.wheelOffset, 32, false);
        
        encoder0.encode(this.tick120ths, 40, false);
    }
}