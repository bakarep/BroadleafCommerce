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
package org.broadleafcommerce.offer.service;

import java.util.List;

import org.broadleafcommerce.offer.domain.Offer;
import org.broadleafcommerce.order.domain.Order;
import org.broadleafcommerce.pricing.service.exception.PricingException;

/**
 * The Interface OfferService.
 */
public interface OfferService {

    /**
     * Lookup offer by code.
     * @param code the code
     * @return the offer
     */
    public Offer lookupOfferByCode(String code);

    /**
     * Apply offers to order.
     * @param offers the offers
     * @param order the order
     */
    public void applyOffersToOrder(List<Offer> offers, Order order) throws PricingException;

    /**
     * Create a list of offers that applies to this order
     * @param order
     * @return
     */
    public List<Offer> buildOfferListForOrder(Order order);


}