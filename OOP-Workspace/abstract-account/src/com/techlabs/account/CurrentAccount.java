package com.techlabs.account;

public class CurrentAccount extends Account {
	public CurrentAccount(int accountNumber,String name,double balance) {
		super(accountNumber,name,balance);
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance-amount<-2000) {
			System.out.println("Account Balance Low");
		}
		this.balance=this.balance-amount;
	}
}
