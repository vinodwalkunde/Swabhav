package com.techlabs.account;

public abstract class Account {
	private int accountNumber;
	private String name;
	protected double balance;
	public Account(int accountNumber,String name,double balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(double amount){
		this.balance=this.balance+amount;
	}
	public abstract void withdraw(double amount);
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	public String toString() {
		return accountNumber+" "+name+" "+balance;
		
	}
	
	
	
}
