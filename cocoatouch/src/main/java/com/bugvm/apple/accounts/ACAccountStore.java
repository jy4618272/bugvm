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
package com.bugvm.apple.accounts;

/*<imports>*/

import com.bugvm.apple.foundation.*;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.block.VoidBlock2;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accounts") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ACAccountStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 5.0 and later.
         */
        public NSObject observeDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class ACAccountStorePtr extends Ptr<ACAccountStore, ACAccountStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ACAccountStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ACAccountStore() {}
    protected ACAccountStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accounts")
    public native NSArray<ACAccount> getAccounts();
    /*</properties>*/
    /*<members>*//*</members>*/
    public void requestAccessToAccounts(ACAccountType accountType, ACAccountOptions options, @Block VoidBlock2<Boolean, NSError> completion) {
        requestAccessToAccounts(accountType, options == null ? null : options.getDictionary(), completion);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="ACAccountStoreDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "accountWithIdentifier:")
    public native ACAccount getAccount(String identifier);
    @Method(selector = "accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType getAccountType(ACAccountTypeIdentifier typeIdentifier);
    @Method(selector = "accountsWithAccountType:")
    public native NSArray<ACAccount> getAccounts(ACAccountType accountType);
    @Method(selector = "saveAccount:withCompletionHandler:")
    public native void saveAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Method(selector = "requestAccessToAccountsWithType:withCompletionHandler:")
    public native void requestAccessToAccounts(ACAccountType accountType, @Block VoidBlock2<Boolean, NSError> handler);
    @Method(selector = "requestAccessToAccountsWithType:options:completion:")
    protected native void requestAccessToAccounts(ACAccountType accountType, NSDictionary options, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "renewCredentialsForAccount:completion:")
    public native void renewCredentials(ACAccount account, @Block VoidBlock2<ACAccountCredentialRenewResult, NSError> completionHandler);
    @Method(selector = "removeAccount:withCompletionHandler:")
    public native void removeAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /*</methods>*/
}