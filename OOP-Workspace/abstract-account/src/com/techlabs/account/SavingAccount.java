package com.techlabs.account;

public class SavingAccount extends Account {
	public SavingAccount(int accountNumber,String name,double balance) {
		super(accountNumber,name,balance);
	}
	@Override
	public void withdraw(double amount) {
		if(this.balance-amount<1000) {
			System.out.println("Account Balance Low");
		}
		this.balance=this.balance-amount;
	}

}
