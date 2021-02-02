
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/sync/driver/sync_user_settings.h

package org.chromium.chrome.browser;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SyncFirstSetupCompleteSource.BASIC_FLOW, SyncFirstSetupCompleteSource.ADVANCED_FLOW_CONFIRM,
    SyncFirstSetupCompleteSource.ADVANCED_FLOW_INTERRUPTED_TURN_SYNC_ON,
    SyncFirstSetupCompleteSource.ADVANCED_FLOW_INTERRUPTED_LEAVE_SYNC_OFF,
    SyncFirstSetupCompleteSource.ENGINE_INITIALIZED_WITH_AUTO_START,
    SyncFirstSetupCompleteSource.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SyncFirstSetupCompleteSource {
  int BASIC_FLOW = 0;
  int ADVANCED_FLOW_CONFIRM = 1;
  int ADVANCED_FLOW_INTERRUPTED_TURN_SYNC_ON = 2;
  int ADVANCED_FLOW_INTERRUPTED_LEAVE_SYNC_OFF = 3;
  int ENGINE_INITIALIZED_WITH_AUTO_START = 4;
  int MAX_VALUE = ENGINE_INITIALIZED_WITH_AUTO_START;
}