package com.techlabs.observer.test;

import com.techlabs.observer.Account;
import com.techlabs.observer.EmailListener;
import com.techlabs.observer.IAccountListener;
import com.techlabs.observer.SmsListener;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("Vinod", 007, 10000);
		account.deposite(100);
		IAccountListener accountListener = new EmailListener();
		IAccountListener accountListener2 = new SmsListener();
		account.registerListener(accountListener);
		account.registerListener(accountListener2);
		account.deposite(100);
		account.withdraw(500);
	}

}
