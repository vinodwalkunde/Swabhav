package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.repository.Product;

class ProductTest {

	@Test
	public void testForCostAfterDiscount() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(90, product.costAfterDiscount());
	}

	@Test
	public void testForGetterOfId() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(1, product.getId());
	}

	@Test
	public void testForGetterOfName() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals("Deo", product.getName());
	}

	@Test
	public void testForGetterOfCost() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(100, product.getCost());
	}

	@Test
	public void testForGetterOfDiscount() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(10, product.getDiscount());
	}

}
