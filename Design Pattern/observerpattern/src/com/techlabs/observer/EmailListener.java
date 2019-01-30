package com.techlabs.observer;

public class EmailListener implements IAccountListener{

	@Override
	public void balanceChange(Account account) {
		System.out.println("Email Sent");
		System.out.println(account.getName() + " your Current Balance is " + account.getBalance()
				+ " and Account Number is " + account.getAccountNumber());
	}

}
