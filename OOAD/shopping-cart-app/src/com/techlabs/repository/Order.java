package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date date;
	private List<LineItem> item = new ArrayList<LineItem>();
	private double totalcheckoutPrice;

	public Order(Date date) {
		this.date = date;
	}

	public double getTotalcheckoutPrice() {
		return totalcheckoutPrice;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItem() {
		return item;
	}

	public void addItem(LineItem lineItem) {
		for (int i = 0; i < item.size(); i++) {
			if (lineItem.getProduct().getId() == item.get(i).getProduct().getId()) {
				item.get(i).setQuantity(lineItem.getQuantity() + item.get(i).getQuantity());
				return;
			}
		}
		item.add(lineItem);
	}

	public double checkOutPrice() {
		for (LineItem lineitem : item) {
			totalcheckoutPrice = totalcheckoutPrice + lineitem.calculateLineItemCost();
		}
		return totalcheckoutPrice;

	}

}
