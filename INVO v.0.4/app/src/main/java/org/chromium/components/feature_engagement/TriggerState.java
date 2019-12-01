
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/feature_engagement/public/tracker.h

package org.chromium.components.feature_engagement;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TriggerState.HAS_BEEN_DISPLAYED, TriggerState.HAS_NOT_BEEN_DISPLAYED, TriggerState.NOT_READY
})
@Retention(RetentionPolicy.SOURCE)
public @interface TriggerState {
  int HAS_BEEN_DISPLAYED = 0;
  int HAS_NOT_BEEN_DISPLAYED = 1;
  int NOT_READY = 2;
}
