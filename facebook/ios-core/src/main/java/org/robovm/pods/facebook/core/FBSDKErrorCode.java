/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.core;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
@ForceLinkClass(FBSDKError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FBSDKErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Reserved(0L),
    Encryption(1L),
    InvalidArgument(2L),
    Unknown(3L),
    Network(4L),
    AppEventsFlush(5L),
    GraphRequestNonTextMimeTypeReturned(6L),
    GraphRequestProtocolMismatch(7L),
    GraphRequestGraphAPI(8L),
    DialogUnavailable(9L),
    AccessTokenRequired(10L),
    AppVersionUnsupported(11L),
    BrowserUnavailable(12L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/FBSDKErrorCode/*</name>*/(long n) { this.n = n; }
    @Override
    public long value() { return n; }
    public static /*<name>*/FBSDKErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBSDKErrorCode/*</name>*/.class.getName());
    }
}
