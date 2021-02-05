// AudioInputStream.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/audio_input_stream.mojom
//

package org.chromium.media.mojom;


public interface AudioInputStream extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AudioInputStream, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AudioInputStream, AudioInputStream.Proxy> MANAGER = AudioInputStream_Internal.MANAGER;


    void record(
);



    void setVolume(
double volume);


}
