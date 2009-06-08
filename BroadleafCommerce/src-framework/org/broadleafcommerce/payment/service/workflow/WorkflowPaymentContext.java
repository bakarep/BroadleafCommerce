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
package org.broadleafcommerce.payment.service.workflow;

import org.broadleafcommerce.workflow.ProcessContext;

public class WorkflowPaymentContext implements ProcessContext {

    public final static long serialVersionUID = 1L;

    private boolean stopEntireProcess = false;
    private CombinedPaymentContextSeed seedData;

    @Override
    public void setSeedData(Object seedObject) {
        this.seedData = (CombinedPaymentContextSeed) seedObject;
    }

    @Override
    public boolean stopProcess() {
        this.stopEntireProcess = true;
        return stopEntireProcess;
    }

    public boolean isStopped() {
        return stopEntireProcess;
    }

    public CombinedPaymentContextSeed getSeedData(){
        return seedData;
    }

}