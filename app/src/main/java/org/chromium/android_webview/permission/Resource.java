
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../android_webview/browser/permission/aw_permission_request.h

package org.chromium.android_webview.permission;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    Resource.GEOLOCATION, Resource.VIDEO_CAPTURE, Resource.AUDIO_CAPTURE,
    Resource.PROTECTED_MEDIA_ID, Resource.MIDI_SYSEX
})
@Retention(RetentionPolicy.SOURCE)
public @interface Resource {
  int GEOLOCATION = 1 << 0;
  int VIDEO_CAPTURE = 1 << 1;
  int AUDIO_CAPTURE = 1 << 2;
  int PROTECTED_MEDIA_ID = 1 << 3;
  int MIDI_SYSEX = 1 << 4;
}
