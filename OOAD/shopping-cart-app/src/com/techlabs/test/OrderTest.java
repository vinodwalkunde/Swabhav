package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.repository.LineItem;
import com.techlabs.repository.Order;
import com.techlabs.repository.Product;

class OrderTest {

	@Test
	public void testForCheckOutPrice() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		Product product1 = new Product(2, "Shirt", 200, 50);
		LineItem lineItem1 = new LineItem(1, 1, product1);
		Order order = new Order(null);
		order.addItem(lineItem);
		order.addItem(lineItem1);
		System.out.println(order.checkOutPrice());
		assertEquals(360, (int) order.checkOutPrice());

	}

}
