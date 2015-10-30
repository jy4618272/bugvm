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
package com.bugvm.apple.coretelephony;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreTelephony") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTCarrier/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTCarrierPtr extends Ptr<CTCarrier, CTCarrierPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CTCarrier.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CTCarrier() {}
    protected CTCarrier(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "carrierName")
    public native String getCarrierName();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "mobileCountryCode")
    public native String getMobileCountryCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "mobileNetworkCode")
    public native String getMobileNetworkCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "isoCountryCode")
    public native String getIsoCountryCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "allowsVOIP")
    public native boolean allowsVOIP();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}