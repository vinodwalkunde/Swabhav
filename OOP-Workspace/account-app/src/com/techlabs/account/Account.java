package com.techlabs.account;

public class Account implements Cloneable{
	static {
		nextAccountNumber = 1;
	}
	private static int nextAccountNumber;
	private int accountNumber;
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = nextAccountNumber++;
	}

	public Account(String name) {
		this(name, 500);
	}

	public void deposit(double balance) {
		this.balance = this.balance + balance;
	}

	public void withdraw(double balance) {
		if (this.balance - balance < 500) {
			System.out.println("Account Balance Low");
		} else
			this.balance = this.balance - balance;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + accountNumber + " " + name + " " + balance;

	}

	@Override
	public boolean equals(Object obj) {
		Account account = (Account) obj;
		if (this.getBalance() == account.getBalance() && this.getName() == account.getName()) {
			return true;
		}
		return false;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
