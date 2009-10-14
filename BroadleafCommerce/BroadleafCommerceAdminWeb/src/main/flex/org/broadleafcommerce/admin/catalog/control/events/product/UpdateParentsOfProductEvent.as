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
package org.broadleafcommerce.admin.catalog.control.events.product
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.collections.ArrayCollection;
	
	import org.broadleafcommerce.admin.catalog.vo.product.Product;

	public class UpdateParentsOfProductEvent extends CairngormEvent
	{
		public static const EVENT_ADD_PARENT_TO_PRODUCT:String = "add_parent_to_product_event";
		
		public var product:Product;
		public var parents:ArrayCollection;
		
		public function UpdateParentsOfProductEvent(product:Product, parents:ArrayCollection)
		{
			super(EVENT_ADD_PARENT_TO_PRODUCT);
			this.product = product;
			this.parents = parents;
		}
		
	}
}