/*
 * Copyright 2008-2009 the original author or authors.
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
package org.broadleafcommerce.email.domain;

/**
 * The EmailTarget interface is used to specify the recipients of the email.
 *
 * @see EmailTargetImpl
 * @author bpolster
 */
public interface EmailTarget {

    public String getEmailAddress();
    public void setEmailAddress(String emailAddress);
    public String[] getCCAddresses();
    public void setCCAddresses(String[] ccAddresses);
    public String[] getBCCAddresses();
    public void setBCCAddresses(String[] BCCAddresses);

}