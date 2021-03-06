package com.techlabs.business;

public class Account {
	private String name;
	private int balance;
	private String password;

	public Account(String name, int balance, String password) {
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public Account() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
