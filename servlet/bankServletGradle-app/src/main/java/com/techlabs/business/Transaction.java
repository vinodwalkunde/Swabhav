package com.techlabs.business;

public class Transaction {
	private String name;
	private String paymentType;
	private int amount;
	private String date;

	public Transaction(String name, String paymentType, int amount, String date) {
		this.name = name;
		this.paymentType = paymentType;
		this.amount = amount;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
