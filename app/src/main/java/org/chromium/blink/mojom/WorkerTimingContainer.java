// WorkerTimingContainer.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/timing/worker_timing_container.mojom
//

package org.chromium.blink.mojom;


public interface WorkerTimingContainer extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WorkerTimingContainer, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WorkerTimingContainer, WorkerTimingContainer.Proxy> MANAGER = WorkerTimingContainer_Internal.MANAGER;


    void addPerformanceEntry(
PerformanceMarkOrMeasure entry);


}
