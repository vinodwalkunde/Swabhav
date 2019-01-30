package com.techlabs.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.techlabs.repository.LineItem;
import com.techlabs.repository.Product;

class LineItemTest {

	@Test
	public void testForCalculateLineItemCost() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		assertEquals(180, lineItem.calculateLineItemCost());
	}

	@Test
	public void testForGetterOfId() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		assertEquals(1, lineItem.getId());
	}

	@Test
	public void testForGetterOfQuantity() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		assertEquals(2, lineItem.getQuantity());
	}

	@Test
	public void testForGetterOfProduct() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		assertEquals(product, lineItem.getProduct());
	}

}
