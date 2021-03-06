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
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweetEntity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, TWTRJSONConvertible/*</implements>*/ {

    /*<ptr>*/public static class TWTRTweetEntityPtr extends Ptr<TWTRTweetEntity, TWTRTweetEntityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTweetEntity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTweetEntity() {}
    protected TWTRTweetEntity(Handle h, long handle) { super(h, handle); }
    protected TWTRTweetEntity(SkipInit skipInit) { super(skipInit); }
    public TWTRTweetEntity(@MachineSizedSInt long startIndex, @MachineSizedSInt long endIndex) { super((SkipInit) null); initObject(init(startIndex, endIndex)); }
    public TWTRTweetEntity(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    public TWTRTweetEntity(NSDictionary<?, ?> jsonDictionary) { super((SkipInit) null); initObject(init(jsonDictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startIndex")
    public native @MachineSizedSInt long getStartIndex();
    @Property(selector = "endIndex")
    public native @MachineSizedSInt long getEndIndex();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStartIndex:endIndex:")
    protected native @Pointer long init(@MachineSizedSInt long startIndex, @MachineSizedSInt long endIndex);
    @Method(selector = "accessibilityValue")
    public native String getAccessibilityValue();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "initWithJSONDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> jsonDictionary);
    /*</methods>*/
}
