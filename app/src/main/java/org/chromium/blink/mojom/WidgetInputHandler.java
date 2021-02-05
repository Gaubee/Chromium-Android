// WidgetInputHandler.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_handler.mojom
//

package org.chromium.blink.mojom;


public interface WidgetInputHandler extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WidgetInputHandler, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WidgetInputHandler, WidgetInputHandler.Proxy> MANAGER = WidgetInputHandler_Internal.MANAGER;


    void setFocus(
boolean focused);



    void mouseCaptureLost(
);



    void setEditCommandsForNextKeyEvent(
EditCommand[] commands);



    void cursorVisibilityChanged(
boolean visible);



    void imeSetComposition(
org.chromium.mojo_base.mojom.String16 text, org.chromium.ui.mojom.ImeTextSpan[] imeTextSpans, org.chromium.gfx.mojom.Range range, int start, int end);



    void imeCommitText(
org.chromium.mojo_base.mojom.String16 text, org.chromium.ui.mojom.ImeTextSpan[] imeTextSpans, org.chromium.gfx.mojom.Range range, int relativeCursorPosition, 
ImeCommitTextResponse callback);

    interface ImeCommitTextResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void imeFinishComposingText(
boolean keepSelection);



    void requestTextInputStateUpdate(
);



    void requestCompositionUpdates(
boolean immediateRequest, boolean monitorRequest);



    void dispatchEvent(
Event event, 
DispatchEventResponse callback);

    interface DispatchEventResponse extends org.chromium.mojo.bindings.Callbacks.Callback5<Integer, org.chromium.ui.mojom.LatencyInfo, Integer, DidOverscrollParams, TouchActionOptional> { }



    void dispatchNonBlockingEvent(
Event event);



    void waitForInputProcessed(

WaitForInputProcessedResponse callback);

    interface WaitForInputProcessedResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void attachSynchronousCompositor(
SynchronousCompositorControlHost controlHost, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported compositorRequest);



    void getFrameWidgetInputHandler(
org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported interfaceRequest);


}
