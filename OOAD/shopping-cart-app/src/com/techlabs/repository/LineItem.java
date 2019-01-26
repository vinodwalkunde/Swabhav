package com.techlabs.repository;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;
	private double lineItemCost;

	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public double calculateLineItemCost() {
		return lineItemCost = (quantity * product.costAfterDiscount());

	}

	public double getLineItemCost() {
		return lineItemCost;
	}

	public int getId() {
		return id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

}
