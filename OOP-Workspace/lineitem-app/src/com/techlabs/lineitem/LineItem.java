package com.techlabs.lineitem;

public class LineItem {
	private int id;
	private String name;
	private double cost;
	private int quantity;

	public LineItem(int id, String name, double cost, int quantity) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public double calculateTotal() {
		return cost * quantity;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}

}
