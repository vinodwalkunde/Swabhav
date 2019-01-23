package com.techlabs.test.lineitem;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestLineItem {

	public static void main(String[] args) {
		double totalCost = 0;
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(1, "pen", 10, 20));
		cart.add(new LineItem(2, "pencil", 5, 30));

		 cart.add("Swabhav");
		 cart.add(100);
		for (Object object : cart) {
			LineItem lineItem = (LineItem) object;
			totalCost = totalCost + lineItem.calculateTotal();
			System.out.println(" " + lineItem.getQuantity() + " " + lineItem.getName() + " " + totalCost);
		}
//		System.out.println(totalCost);
	}

}
