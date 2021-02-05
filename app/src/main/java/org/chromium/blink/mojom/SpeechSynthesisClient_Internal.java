// SpeechSynthesisClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/speech/speech_synthesis.mojom
//

package org.chromium.blink.mojom;


class SpeechSynthesisClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SpeechSynthesisClient, SpeechSynthesisClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SpeechSynthesisClient, SpeechSynthesisClient.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SpeechSynthesisClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, SpeechSynthesisClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public SpeechSynthesisClient[] buildArray(int size) {
          return new SpeechSynthesisClient[size];
        }
    };


    private static final int ON_STARTED_SPEAKING_ORDINAL = 0;

    private static final int ON_FINISHED_SPEAKING_ORDINAL = 1;

    private static final int ON_PAUSED_SPEAKING_ORDINAL = 2;

    private static final int ON_RESUMED_SPEAKING_ORDINAL = 3;

    private static final int ON_ENCOUNTERED_WORD_BOUNDARY_ORDINAL = 4;

    private static final int ON_ENCOUNTERED_SENTENCE_BOUNDARY_ORDINAL = 5;

    private static final int ON_ENCOUNTERED_SPEAKING_ERROR_ORDINAL = 6;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SpeechSynthesisClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onStartedSpeaking(
) {

            SpeechSynthesisClientOnStartedSpeakingParams _message = new SpeechSynthesisClientOnStartedSpeakingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_STARTED_SPEAKING_ORDINAL)));

        }


        @Override
        public void onFinishedSpeaking(
) {

            SpeechSynthesisClientOnFinishedSpeakingParams _message = new SpeechSynthesisClientOnFinishedSpeakingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_FINISHED_SPEAKING_ORDINAL)));

        }


        @Override
        public void onPausedSpeaking(
) {

            SpeechSynthesisClientOnPausedSpeakingParams _message = new SpeechSynthesisClientOnPausedSpeakingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_PAUSED_SPEAKING_ORDINAL)));

        }


        @Override
        public void onResumedSpeaking(
) {

            SpeechSynthesisClientOnResumedSpeakingParams _message = new SpeechSynthesisClientOnResumedSpeakingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RESUMED_SPEAKING_ORDINAL)));

        }


        @Override
        public void onEncounteredWordBoundary(
int charIndex, int charLength) {

            SpeechSynthesisClientOnEncounteredWordBoundaryParams _message = new SpeechSynthesisClientOnEncounteredWordBoundaryParams();

            _message.charIndex = charIndex;

            _message.charLength = charLength;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ENCOUNTERED_WORD_BOUNDARY_ORDINAL)));

        }


        @Override
        public void onEncounteredSentenceBoundary(
int charIndex, int charLength) {

            SpeechSynthesisClientOnEncounteredSentenceBoundaryParams _message = new SpeechSynthesisClientOnEncounteredSentenceBoundaryParams();

            _message.charIndex = charIndex;

            _message.charLength = charLength;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ENCOUNTERED_SENTENCE_BOUNDARY_ORDINAL)));

        }


        @Override
        public void onEncounteredSpeakingError(
) {

            SpeechSynthesisClientOnEncounteredSpeakingErrorParams _message = new SpeechSynthesisClientOnEncounteredSpeakingErrorParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ENCOUNTERED_SPEAKING_ERROR_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SpeechSynthesisClient> {

        Stub(org.chromium.mojo.system.Core core, SpeechSynthesisClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SpeechSynthesisClient_Internal.MANAGER, messageWithHeader);





                    case ON_STARTED_SPEAKING_ORDINAL: {

                        SpeechSynthesisClientOnStartedSpeakingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onStartedSpeaking();
                        return true;
                    }





                    case ON_FINISHED_SPEAKING_ORDINAL: {

                        SpeechSynthesisClientOnFinishedSpeakingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onFinishedSpeaking();
                        return true;
                    }





                    case ON_PAUSED_SPEAKING_ORDINAL: {

                        SpeechSynthesisClientOnPausedSpeakingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onPausedSpeaking();
                        return true;
                    }





                    case ON_RESUMED_SPEAKING_ORDINAL: {

                        SpeechSynthesisClientOnResumedSpeakingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onResumedSpeaking();
                        return true;
                    }





                    case ON_ENCOUNTERED_WORD_BOUNDARY_ORDINAL: {

                        SpeechSynthesisClientOnEncounteredWordBoundaryParams data =
                                SpeechSynthesisClientOnEncounteredWordBoundaryParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onEncounteredWordBoundary(data.charIndex, data.charLength);
                        return true;
                    }





                    case ON_ENCOUNTERED_SENTENCE_BOUNDARY_ORDINAL: {

                        SpeechSynthesisClientOnEncounteredSentenceBoundaryParams data =
                                SpeechSynthesisClientOnEncounteredSentenceBoundaryParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onEncounteredSentenceBoundary(data.charIndex, data.charLength);
                        return true;
                    }





                    case ON_ENCOUNTERED_SPEAKING_ERROR_ORDINAL: {

                        SpeechSynthesisClientOnEncounteredSpeakingErrorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onEncounteredSpeakingError();
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SpeechSynthesisClient_Internal.MANAGER, messageWithHeader, receiver);
















                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SpeechSynthesisClientOnStartedSpeakingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SpeechSynthesisClientOnStartedSpeakingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnStartedSpeakingParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnStartedSpeakingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnStartedSpeakingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnStartedSpeakingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnStartedSpeakingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnStartedSpeakingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SpeechSynthesisClientOnFinishedSpeakingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SpeechSynthesisClientOnFinishedSpeakingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnFinishedSpeakingParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnFinishedSpeakingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnFinishedSpeakingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnFinishedSpeakingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnFinishedSpeakingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnFinishedSpeakingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SpeechSynthesisClientOnPausedSpeakingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SpeechSynthesisClientOnPausedSpeakingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnPausedSpeakingParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnPausedSpeakingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnPausedSpeakingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnPausedSpeakingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnPausedSpeakingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnPausedSpeakingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SpeechSynthesisClientOnResumedSpeakingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SpeechSynthesisClientOnResumedSpeakingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnResumedSpeakingParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnResumedSpeakingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnResumedSpeakingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnResumedSpeakingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnResumedSpeakingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnResumedSpeakingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SpeechSynthesisClientOnEncounteredWordBoundaryParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int charIndex;
        public int charLength;

        private SpeechSynthesisClientOnEncounteredWordBoundaryParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnEncounteredWordBoundaryParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnEncounteredWordBoundaryParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnEncounteredWordBoundaryParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnEncounteredWordBoundaryParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnEncounteredWordBoundaryParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnEncounteredWordBoundaryParams(elementsOrVersion);
                    {
                        
                    result.charIndex = decoder0.readInt(8);
                    }
                    {
                        
                    result.charLength = decoder0.readInt(12);
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
            
            encoder0.encode(this.charIndex, 8);
            
            encoder0.encode(this.charLength, 12);
        }
    }



    
    static final class SpeechSynthesisClientOnEncounteredSentenceBoundaryParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int charIndex;
        public int charLength;

        private SpeechSynthesisClientOnEncounteredSentenceBoundaryParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnEncounteredSentenceBoundaryParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnEncounteredSentenceBoundaryParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnEncounteredSentenceBoundaryParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnEncounteredSentenceBoundaryParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnEncounteredSentenceBoundaryParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnEncounteredSentenceBoundaryParams(elementsOrVersion);
                    {
                        
                    result.charIndex = decoder0.readInt(8);
                    }
                    {
                        
                    result.charLength = decoder0.readInt(12);
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
            
            encoder0.encode(this.charIndex, 8);
            
            encoder0.encode(this.charLength, 12);
        }
    }



    
    static final class SpeechSynthesisClientOnEncounteredSpeakingErrorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SpeechSynthesisClientOnEncounteredSpeakingErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SpeechSynthesisClientOnEncounteredSpeakingErrorParams() {
            this(0);
        }

        public static SpeechSynthesisClientOnEncounteredSpeakingErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SpeechSynthesisClientOnEncounteredSpeakingErrorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SpeechSynthesisClientOnEncounteredSpeakingErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SpeechSynthesisClientOnEncounteredSpeakingErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SpeechSynthesisClientOnEncounteredSpeakingErrorParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



}
