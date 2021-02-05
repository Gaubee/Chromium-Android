// VideoEncodeAccelerator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;


public interface VideoEncodeAccelerator extends org.chromium.mojo.bindings.Interface {



    public static final class Error {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int ILLEGAL_STATE = 0;
        public static final int INVALID_ARGUMENT = 1;
        public static final int PLATFORM_FAILURE = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        private Error() {}
    }


    public interface Proxy extends VideoEncodeAccelerator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoEncodeAccelerator, VideoEncodeAccelerator.Proxy> MANAGER = VideoEncodeAccelerator_Internal.MANAGER;


    void initialize(
VideoEncodeAcceleratorConfig config, VideoEncodeAcceleratorClient client, 
InitializeResponse callback);

    interface InitializeResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void encode(
VideoFrame frame, boolean forceKeyframe, 
EncodeResponse callback);

    interface EncodeResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void useOutputBitstreamBuffer(
int bitstreamBufferId, org.chromium.mojo.system.SharedBufferHandle buffer);



    void requestEncodingParametersChange(
VideoBitrateAllocation bitrateAllocation, int framerate);



    void isFlushSupported(

IsFlushSupportedResponse callback);

    interface IsFlushSupportedResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void flush(

FlushResponse callback);

    interface FlushResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}