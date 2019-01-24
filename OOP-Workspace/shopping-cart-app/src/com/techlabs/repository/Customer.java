package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String location;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public List<Order> getOrders() {
		return orders;
	}
	public void htmlGenerator() {
		
	}
}
