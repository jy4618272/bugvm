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
package com.bugvm.apple.dispatch;

/*<imports>*/

import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("System")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DispatchGroup/*</name>*/ 
    extends /*<extends>*/DispatchObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DispatchGroupPtr extends Ptr<DispatchGroup, DispatchGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(DispatchGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DispatchGroup() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_create", optional=true)
    public static native DispatchGroup create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_async", optional=true)
    public native void async(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_wait", optional=true)
    public native @MachineSizedSInt long await(long timeout);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_notify", optional=true)
    public native void notify(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_enter", optional=true)
    public native void enter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="dispatch_group_leave", optional=true)
    public native void leave();
    /*</methods>*/
}