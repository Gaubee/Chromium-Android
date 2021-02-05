// MdnsListenClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;


public interface MdnsListenClient extends org.chromium.mojo.bindings.Interface {



    public static final class UpdateType {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int ADDED = 0;
        public static final int CHANGED = 1;
        public static final int REMOVED = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        private UpdateType() {}
    }


    public interface Proxy extends MdnsListenClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MdnsListenClient, MdnsListenClient.Proxy> MANAGER = MdnsListenClient_Internal.MANAGER;


    void onAddressResult(
int updateType, int queryType, IpEndPoint endpoint);



    void onTextResult(
int updateType, int queryType, String[] textRecords);



    void onHostnameResult(
int updateType, int queryType, HostPortPair host);



    void onUnhandledResult(
int updateType, int queryType);


}
