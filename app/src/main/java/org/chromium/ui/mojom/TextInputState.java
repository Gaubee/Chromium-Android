// TextInputState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/base/ime/mojom/text_input_state.mojom
//

package org.chromium.ui.mojom;


public final class TextInputState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int type;
    public int mode;
    public int action;
    public int flags;
    public org.chromium.mojo_base.mojom.BigString16 value;
    public org.chromium.gfx.mojom.Range selection;
    public org.chromium.gfx.mojom.Range composition;
    public boolean canComposeInline;
    public boolean showImeIfNeeded;
    public boolean alwaysHideIme;
    public boolean replyToRequest;
    public org.chromium.gfx.mojom.Rect editContextControlBounds;
    public org.chromium.gfx.mojom.Rect editContextSelectionBounds;
    public int vkPolicy;
    public int lastVkVisibilityRequest;
    public ImeTextSpanInfo[] imeTextSpansInfo;

    private TextInputState(int version) {
        super(STRUCT_SIZE, version);
        this.type = (int) TextInputType.NONE;
        this.mode = (int) TextInputMode.DEFAULT;
        this.action = (int) TextInputAction.DEFAULT;
        this.canComposeInline = (boolean) true;
        this.vkPolicy = (int) VirtualKeyboardPolicy.AUTO;
        this.lastVkVisibilityRequest = (int) VirtualKeyboardVisibilityRequest.NONE;
    }

    public TextInputState() {
        this(0);
    }

    public static TextInputState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TextInputState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TextInputState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TextInputState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TextInputState(elementsOrVersion);
                {
                    
                result.type = decoder0.readInt(8);
                    TextInputType.validate(result.type);
                }
                {
                    
                result.mode = decoder0.readInt(12);
                    TextInputMode.validate(result.mode);
                }
                {
                    
                result.action = decoder0.readInt(16);
                    TextInputAction.validate(result.action);
                }
                {
                    
                result.flags = decoder0.readInt(20);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.value = org.chromium.mojo_base.mojom.BigString16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.selection = org.chromium.gfx.mojom.Range.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.composition = org.chromium.gfx.mojom.Range.decode(decoder1);
                }
                {
                    
                result.canComposeInline = decoder0.readBoolean(48, 0);
                }
                {
                    
                result.showImeIfNeeded = decoder0.readBoolean(48, 1);
                }
                {
                    
                result.alwaysHideIme = decoder0.readBoolean(48, 2);
                }
                {
                    
                result.replyToRequest = decoder0.readBoolean(48, 3);
                }
                {
                    
                result.vkPolicy = decoder0.readInt(52);
                    VirtualKeyboardPolicy.validate(result.vkPolicy);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.editContextControlBounds = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.editContextSelectionBounds = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                result.lastVkVisibilityRequest = decoder0.readInt(72);
                    VirtualKeyboardVisibilityRequest.validate(result.lastVkVisibilityRequest);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.imeTextSpansInfo = new ImeTextSpanInfo[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.imeTextSpansInfo[i1] = ImeTextSpanInfo.decode(decoder2);
                    }
                }
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
        
        encoder0.encode(this.type, 8);
        
        encoder0.encode(this.mode, 12);
        
        encoder0.encode(this.action, 16);
        
        encoder0.encode(this.flags, 20);
        
        encoder0.encode(this.value, 24, true);
        
        encoder0.encode(this.selection, 32, false);
        
        encoder0.encode(this.composition, 40, true);
        
        encoder0.encode(this.canComposeInline, 48, 0);
        
        encoder0.encode(this.showImeIfNeeded, 48, 1);
        
        encoder0.encode(this.alwaysHideIme, 48, 2);
        
        encoder0.encode(this.replyToRequest, 48, 3);
        
        encoder0.encode(this.vkPolicy, 52);
        
        encoder0.encode(this.editContextControlBounds, 56, true);
        
        encoder0.encode(this.editContextSelectionBounds, 64, true);
        
        encoder0.encode(this.lastVkVisibilityRequest, 72);
        
        if (this.imeTextSpansInfo == null) {
            encoder0.encodeNullPointer(80, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.imeTextSpansInfo.length, 80, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.imeTextSpansInfo.length; ++i0) {
                
                encoder1.encode(this.imeTextSpansInfo[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}