// VirtualAuthenticatorOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/virtual_authenticator.mojom
//

package org.chromium.blink.test.mojom;


public final class VirtualAuthenticatorOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int protocol;
    public int ctap2Version;
    public int transport;
    public int attachment;
    public boolean hasResidentKey;
    public boolean hasUserVerification;
    public boolean isUserPresent;
    public boolean hasLargeBlob;

    private VirtualAuthenticatorOptions(int version) {
        super(STRUCT_SIZE, version);
        this.isUserPresent = (boolean) true;
    }

    public VirtualAuthenticatorOptions() {
        this(0);
    }

    public static VirtualAuthenticatorOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VirtualAuthenticatorOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VirtualAuthenticatorOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VirtualAuthenticatorOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VirtualAuthenticatorOptions(elementsOrVersion);
                {
                    
                result.protocol = decoder0.readInt(8);
                    ClientToAuthenticatorProtocol.validate(result.protocol);
                }
                {
                    
                result.ctap2Version = decoder0.readInt(12);
                    Ctap2Version.validate(result.ctap2Version);
                }
                {
                    
                result.transport = decoder0.readInt(16);
                    org.chromium.blink.mojom.AuthenticatorTransport.validate(result.transport);
                }
                {
                    
                result.attachment = decoder0.readInt(20);
                    org.chromium.blink.mojom.AuthenticatorAttachment.validate(result.attachment);
                }
                {
                    
                result.hasResidentKey = decoder0.readBoolean(24, 0);
                }
                {
                    
                result.hasUserVerification = decoder0.readBoolean(24, 1);
                }
                {
                    
                result.isUserPresent = decoder0.readBoolean(24, 2);
                }
                {
                    
                result.hasLargeBlob = decoder0.readBoolean(24, 3);
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
        
        encoder0.encode(this.protocol, 8);
        
        encoder0.encode(this.ctap2Version, 12);
        
        encoder0.encode(this.transport, 16);
        
        encoder0.encode(this.attachment, 20);
        
        encoder0.encode(this.hasResidentKey, 24, 0);
        
        encoder0.encode(this.hasUserVerification, 24, 1);
        
        encoder0.encode(this.isUserPresent, 24, 2);
        
        encoder0.encode(this.hasLargeBlob, 24, 3);
    }
}