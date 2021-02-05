// CompositorRenderPass.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/compositor_render_pass.mojom
//

package org.chromium.viz.mojom;


public final class CompositorRenderPass extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 96;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(96, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public CompositorRenderPassId id;
    public org.chromium.gfx.mojom.Rect outputRect;
    public org.chromium.gfx.mojom.Rect damageRect;
    public org.chromium.gfx.mojom.Transform transformToRootTarget;
    public FilterOperations filters;
    public FilterOperations backdropFilters;
    public org.chromium.gfx.mojom.RRectF backdropFilterBounds;
    public SubtreeCaptureId subtreeCaptureId;
    public boolean hasTransparentBackground;
    public boolean cacheRenderPass;
    public boolean hasDamageFromContributingContent;
    public boolean generateMipmap;
    public CopyOutputRequest[] copyRequests;
    public DrawQuad[] quadList;

    private CompositorRenderPass(int version) {
        super(STRUCT_SIZE, version);
        this.cacheRenderPass = (boolean) false;
        this.hasDamageFromContributingContent = (boolean) false;
        this.generateMipmap = (boolean) false;
    }

    public CompositorRenderPass() {
        this(0);
    }

    public static CompositorRenderPass deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CompositorRenderPass deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CompositorRenderPass decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CompositorRenderPass result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CompositorRenderPass(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.id = CompositorRenderPassId.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.outputRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.damageRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.transformToRootTarget = org.chromium.gfx.mojom.Transform.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.filters = FilterOperations.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.backdropFilters = FilterOperations.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.backdropFilterBounds = org.chromium.gfx.mojom.RRectF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.subtreeCaptureId = SubtreeCaptureId.decode(decoder1);
                }
                {
                    
                result.hasTransparentBackground = decoder0.readBoolean(72, 0);
                }
                {
                    
                result.cacheRenderPass = decoder0.readBoolean(72, 1);
                }
                {
                    
                result.hasDamageFromContributingContent = decoder0.readBoolean(72, 2);
                }
                {
                    
                result.generateMipmap = decoder0.readBoolean(72, 3);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.copyRequests = new CopyOutputRequest[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.copyRequests[i1] = CopyOutputRequest.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.quadList = new DrawQuad[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.quadList[i1] = DrawQuad.decode(decoder2);
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
        
        encoder0.encode(this.id, 8, false);
        
        encoder0.encode(this.outputRect, 16, false);
        
        encoder0.encode(this.damageRect, 24, false);
        
        encoder0.encode(this.transformToRootTarget, 32, false);
        
        encoder0.encode(this.filters, 40, false);
        
        encoder0.encode(this.backdropFilters, 48, false);
        
        encoder0.encode(this.backdropFilterBounds, 56, true);
        
        encoder0.encode(this.subtreeCaptureId, 64, false);
        
        encoder0.encode(this.hasTransparentBackground, 72, 0);
        
        encoder0.encode(this.cacheRenderPass, 72, 1);
        
        encoder0.encode(this.hasDamageFromContributingContent, 72, 2);
        
        encoder0.encode(this.generateMipmap, 72, 3);
        
        if (this.copyRequests == null) {
            encoder0.encodeNullPointer(80, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.copyRequests.length, 80, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.copyRequests.length; ++i0) {
                
                encoder1.encode(this.copyRequests[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.quadList == null) {
            encoder0.encodeNullPointer(88, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.quadList.length, 88, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.quadList.length; ++i0) {
                
                encoder1.encode(this.quadList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}