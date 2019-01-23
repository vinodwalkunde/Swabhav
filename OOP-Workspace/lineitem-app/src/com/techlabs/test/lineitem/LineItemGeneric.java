package com.techlabs.test.lineitem;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.lineitem.LineItem;

public class LineItemGeneric {

	public static void main(String[] args) {
		double totalCost = 0;
		List<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(1, "pen", 10, 20));
		cart.add(new LineItem(2, "pencil", 5, 30));
		for (LineItem lineItem : cart) {
			totalCost = totalCost + lineItem.calculateTotal();
			System.out.println(" " + lineItem.getQuantity() + " " + lineItem.getName() + " " + totalCost);
		}
	}

}
