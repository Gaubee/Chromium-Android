// SynchronousCompositor.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/synchronous_compositor.mojom
//

package org.chromium.blink.mojom;


public interface SynchronousCompositor extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SynchronousCompositor, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SynchronousCompositor, SynchronousCompositor.Proxy> MANAGER = SynchronousCompositor_Internal.MANAGER;


    void demandDrawHwAsync(
SyncCompositorDemandDrawHwParams drawParams);



    void demandDrawHw(
SyncCompositorDemandDrawHwParams drawParams, 
DemandDrawHwResponse callback);

    interface DemandDrawHwResponse extends org.chromium.mojo.bindings.Callbacks.Callback6<SyncCompositorCommonRendererParams, Integer, Integer, org.chromium.viz.mojom.LocalSurfaceId, org.chromium.viz.mojom.CompositorFrame, org.chromium.viz.mojom.HitTestRegionList> { }



    void setSharedMemory(
org.chromium.mojo_base.mojom.WritableSharedMemoryRegion shmRegion, 
SetSharedMemoryResponse callback);

    interface SetSharedMemoryResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, SyncCompositorCommonRendererParams> { }



    void demandDrawSw(
SyncCompositorDemandDrawSwParams drawParams, 
DemandDrawSwResponse callback);

    interface DemandDrawSwResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<SyncCompositorCommonRendererParams, Integer, org.chromium.viz.mojom.CompositorFrameMetadata> { }



    void willSkipDraw(
);



    void zeroSharedMemory(
);



    void zoomBy(
float delta, org.chromium.gfx.mojom.Point anchor, 
ZoomByResponse callback);

    interface ZoomByResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<SyncCompositorCommonRendererParams> { }



    void setMemoryPolicy(
int bytesLimit);



    void reclaimResources(
int layerTreeFrameSinkId, org.chromium.viz.mojom.ReturnedResource[] resources);



    void setScroll(
org.chromium.gfx.mojom.ScrollOffset offset);



    void beginFrame(
org.chromium.viz.mojom.BeginFrameArgs args, java.util.Map<Integer, org.chromium.viz.mojom.FrameTimingDetails> timingDetails);



    void setBeginFrameSourcePaused(
boolean paused);


}