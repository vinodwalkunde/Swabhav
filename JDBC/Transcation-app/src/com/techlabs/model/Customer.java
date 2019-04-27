package com.techlabs.model;

public class Customer {
	private int id;
	private int balance;
	private String name;

	public Customer(int id, int balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
