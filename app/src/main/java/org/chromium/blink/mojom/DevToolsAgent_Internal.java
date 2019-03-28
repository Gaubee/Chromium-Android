
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_agent.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class DevToolsAgent_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DevToolsAgent, DevToolsAgent.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DevToolsAgent, DevToolsAgent.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DevToolsAgent";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DevToolsAgent impl) {
            return new Stub(core, impl);
        }

        @Override
        public DevToolsAgent[] buildArray(int size) {
          return new DevToolsAgent[size];
        }
    };


    private static final int ATTACH_DEV_TOOLS_SESSION_ORDINAL = 0;

    private static final int INSPECT_ELEMENT_ORDINAL = 1;

    private static final int REPORT_CHILD_WORKERS_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DevToolsAgent.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void attachDevToolsSession(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported session, org.chromium.mojo.bindings.InterfaceRequest<DevToolsSession> ioSession, DevToolsSessionState reattachSessionState) {

            DevToolsAgentAttachDevToolsSessionParams _message = new DevToolsAgentAttachDevToolsSessionParams();

            _message.host = host;

            _message.session = session;

            _message.ioSession = ioSession;

            _message.reattachSessionState = reattachSessionState;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ATTACH_DEV_TOOLS_SESSION_ORDINAL)));

        }


        @Override
        public void inspectElement(
org.chromium.gfx.mojom.Point point) {

            DevToolsAgentInspectElementParams _message = new DevToolsAgentInspectElementParams();

            _message.point = point;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(INSPECT_ELEMENT_ORDINAL)));

        }


        @Override
        public void reportChildWorkers(
boolean report, boolean waitForDebugger, 
ReportChildWorkersResponse callback) {

            DevToolsAgentReportChildWorkersParams _message = new DevToolsAgentReportChildWorkersParams();

            _message.report = report;

            _message.waitForDebugger = waitForDebugger;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REPORT_CHILD_WORKERS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new DevToolsAgentReportChildWorkersResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DevToolsAgent> {

        Stub(org.chromium.mojo.system.Core core, DevToolsAgent impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                DevToolsAgent_Internal.MANAGER, messageWithHeader);





                    case ATTACH_DEV_TOOLS_SESSION_ORDINAL: {

                        DevToolsAgentAttachDevToolsSessionParams data =
                                DevToolsAgentAttachDevToolsSessionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().attachDevToolsSession(data.host, data.session, data.ioSession, data.reattachSessionState);
                        return true;
                    }





                    case INSPECT_ELEMENT_ORDINAL: {

                        DevToolsAgentInspectElementParams data =
                                DevToolsAgentInspectElementParams.deserialize(messageWithHeader.getPayload());

                        getImpl().inspectElement(data.point);
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
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), DevToolsAgent_Internal.MANAGER, messageWithHeader, receiver);











                    case REPORT_CHILD_WORKERS_ORDINAL: {

                        DevToolsAgentReportChildWorkersParams data =
                                DevToolsAgentReportChildWorkersParams.deserialize(messageWithHeader.getPayload());

                        getImpl().reportChildWorkers(data.report, data.waitForDebugger, new DevToolsAgentReportChildWorkersResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class DevToolsAgentAttachDevToolsSessionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host;
        public org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported session;
        public org.chromium.mojo.bindings.InterfaceRequest<DevToolsSession> ioSession;
        public DevToolsSessionState reattachSessionState;

        private DevToolsAgentAttachDevToolsSessionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsAgentAttachDevToolsSessionParams() {
            this(0);
        }

        public static DevToolsAgentAttachDevToolsSessionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsAgentAttachDevToolsSessionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsAgentAttachDevToolsSessionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsAgentAttachDevToolsSessionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsAgentAttachDevToolsSessionParams(elementsOrVersion);
                    {
                        
                    result.host = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                    }
                    {
                        
                    result.session = decoder0.readAssociatedInterfaceRequestNotSupported(16, false);
                    }
                    {
                        
                    result.ioSession = decoder0.readInterfaceRequest(20, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.reattachSessionState = DevToolsSessionState.decode(decoder1);
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
            
            encoder0.encode(this.host, 8, false);
            
            encoder0.encode(this.session, 16, false);
            
            encoder0.encode(this.ioSession, 20, false);
            
            encoder0.encode(this.reattachSessionState, 24, true);
        }
    }



    
    static final class DevToolsAgentInspectElementParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Point point;

        private DevToolsAgentInspectElementParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsAgentInspectElementParams() {
            this(0);
        }

        public static DevToolsAgentInspectElementParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsAgentInspectElementParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsAgentInspectElementParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsAgentInspectElementParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsAgentInspectElementParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.point = org.chromium.gfx.mojom.Point.decode(decoder1);
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
            
            encoder0.encode(this.point, 8, false);
        }
    }



    
    static final class DevToolsAgentReportChildWorkersParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean report;
        public boolean waitForDebugger;

        private DevToolsAgentReportChildWorkersParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsAgentReportChildWorkersParams() {
            this(0);
        }

        public static DevToolsAgentReportChildWorkersParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsAgentReportChildWorkersParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsAgentReportChildWorkersParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsAgentReportChildWorkersParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsAgentReportChildWorkersParams(elementsOrVersion);
                    {
                        
                    result.report = decoder0.readBoolean(8, 0);
                    }
                    {
                        
                    result.waitForDebugger = decoder0.readBoolean(8, 1);
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
            
            encoder0.encode(this.report, 8, 0);
            
            encoder0.encode(this.waitForDebugger, 8, 1);
        }
    }



    
    static final class DevToolsAgentReportChildWorkersResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private DevToolsAgentReportChildWorkersResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsAgentReportChildWorkersResponseParams() {
            this(0);
        }

        public static DevToolsAgentReportChildWorkersResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsAgentReportChildWorkersResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsAgentReportChildWorkersResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsAgentReportChildWorkersResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsAgentReportChildWorkersResponseParams(elementsOrVersion);

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

    static class DevToolsAgentReportChildWorkersResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final DevToolsAgent.ReportChildWorkersResponse mCallback;

        DevToolsAgentReportChildWorkersResponseParamsForwardToCallback(DevToolsAgent.ReportChildWorkersResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(REPORT_CHILD_WORKERS_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                mCallback.call();
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class DevToolsAgentReportChildWorkersResponseParamsProxyToResponder implements DevToolsAgent.ReportChildWorkersResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DevToolsAgentReportChildWorkersResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call() {
            DevToolsAgentReportChildWorkersResponseParams _response = new DevToolsAgentReportChildWorkersResponseParams();

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REPORT_CHILD_WORKERS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}