// CustomProxyConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;


public final class CustomProxyConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ProxyRules rules;
    public boolean shouldOverrideExistingConfig;
    public boolean allowNonIdempotentMethods;
    public HttpRequestHeaders connectTunnelHeaders;

    private CustomProxyConfig(int version) {
        super(STRUCT_SIZE, version);
        this.shouldOverrideExistingConfig = (boolean) false;
        this.allowNonIdempotentMethods = (boolean) false;
    }

    public CustomProxyConfig() {
        this(0);
    }

    public static CustomProxyConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CustomProxyConfig deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CustomProxyConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CustomProxyConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CustomProxyConfig(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.rules = ProxyRules.decode(decoder1);
                }
                {
                    
                result.shouldOverrideExistingConfig = decoder0.readBoolean(16, 0);
                }
                {
                    
                result.allowNonIdempotentMethods = decoder0.readBoolean(16, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.connectTunnelHeaders = HttpRequestHeaders.decode(decoder1);
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
        
        encoder0.encode(this.rules, 8, false);
        
        encoder0.encode(this.shouldOverrideExistingConfig, 16, 0);
        
        encoder0.encode(this.allowNonIdempotentMethods, 16, 1);
        
        encoder0.encode(this.connectTunnelHeaders, 24, false);
    }
}