// LocalFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface LocalFrame extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends LocalFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalFrame, LocalFrame.Proxy> MANAGER = LocalFrame_Internal.MANAGER;


    void getTextSurroundingSelection(
int maxLength, 
GetTextSurroundingSelectionResponse callback);

    interface GetTextSurroundingSelectionResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<org.chromium.mojo_base.mojom.String16, Integer, Integer> { }



    void sendInterventionReport(
String id, String message);



    void setFrameOwnerProperties(
FrameOwnerProperties properties);



    void notifyUserActivation(
int notificationType);



    void notifyVirtualKeyboardOverlayRect(
org.chromium.gfx.mojom.Rect keyboardRect);



    void addMessageToConsole(
int level, String message, boolean discardDuplicates);



    void addInspectorIssue(
InspectorIssueInfo info);



    void swapInImmediately(
);



    void checkCompleted(
);



    void stopLoading(
);



    void collapse(
boolean collapsed);



    void enableViewSourceMode(
);



    void focus(
);



    void clearFocusedElement(
);



    void getResourceSnapshotForWebBundle(
org.chromium.mojo.bindings.InterfaceRequest<org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle> receiver);



    void copyImageAt(
org.chromium.gfx.mojom.Point windowPoint);



    void saveImageAt(
org.chromium.gfx.mojom.Point windowPoint);



    void reportBlinkFeatureUsage(
int[] features);



    void renderFallbackContent(
);



    void beforeUnload(
boolean isReload, 
BeforeUnloadResponse callback);

    interface BeforeUnloadResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, org.chromium.mojo_base.mojom.TimeTicks, org.chromium.mojo_base.mojom.TimeTicks> { }



    void mediaPlayerActionAt(
org.chromium.gfx.mojom.Point location, MediaPlayerAction action);



    void advanceFocusInFrame(
int focusType, org.chromium.mojo_base.mojom.UnguessableToken sourceFrameToken);



    void advanceFocusInForm(
int focusType);



    void reportContentSecurityPolicyViolation(
org.chromium.network.mojom.CspViolation violation);



    void didUpdateFramePolicy(
FramePolicy framePolicy);



    void onScreensChange(
);



    void postMessageEvent(
org.chromium.mojo_base.mojom.UnguessableToken sourceFrameToken, org.chromium.mojo_base.mojom.String16 sourceOrigin, org.chromium.mojo_base.mojom.String16 targetOrigin, TransferableMessage message);



    void bindReportingObserver(
org.chromium.mojo.bindings.InterfaceRequest<ReportingObserver> receiver);



    void updateOpener(
org.chromium.mojo_base.mojom.UnguessableToken openerFrameToken);



    void getSavableResourceLinks(

GetSavableResourceLinksResponse callback);

    interface GetSavableResourceLinksResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<GetSavableResourceLinksReply> { }



    void mixedContentFound(
org.chromium.url.mojom.Url mainResourceUrl, org.chromium.url.mojom.Url mixedContentUrl, int requestContext, boolean wasAllowed, org.chromium.url.mojom.Url urlBeforeRedirects, boolean hadRedirect, org.chromium.network.mojom.SourceLocation sourceLocation);


}