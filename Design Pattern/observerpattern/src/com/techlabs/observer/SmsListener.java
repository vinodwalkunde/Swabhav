package com.techlabs.observer;

public class SmsListener implements IAccountListener {

	@Override
	public void balanceChange(Account account) {
		System.out.println("SMS Sent");
		System.out.println(account.getName() + " your Current Balance is " + account.getBalance()
				+ " and Account Number is " + account.getAccountNumber());
	}

}
