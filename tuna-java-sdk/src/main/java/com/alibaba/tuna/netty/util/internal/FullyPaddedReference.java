/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.alibaba.tuna.netty.util.internal;

public final class FullyPaddedReference<T> extends LeftPaddedReference<T> {
    private static final long serialVersionUID = -5986650399506826641L;
    // cache line padding (must be public)
    public transient long rp1, rp2, rp3, rp4, rp5, rp6, rp7;      // 56 bytes (excluding LeftPaddedReference.referent)
    public transient long rpA, rpB, rpC, rpD, rpE, rpF, rpG, rpH; // 64 bytes
}
