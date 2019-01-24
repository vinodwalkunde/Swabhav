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

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItem() {
		return item;
	}

	public void addItem(LineItem lineItem) {
		item.add(lineItem);
	}

	public double checkOutPrice() {
		for (LineItem lineitem : item) {
			totalcheckoutPrice = totalcheckoutPrice + lineitem.calculateLineItemCost();
		}
		return totalcheckoutPrice;

	}

}
