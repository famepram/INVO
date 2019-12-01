
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/geolocation_config.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface GeolocationConfig extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends GeolocationConfig, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<GeolocationConfig, GeolocationConfig.Proxy> MANAGER = GeolocationConfig_Internal.MANAGER;


    void isHighAccuracyLocationBeingCaptured(

IsHighAccuracyLocationBeingCapturedResponse callback);

    interface IsHighAccuracyLocationBeingCapturedResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
