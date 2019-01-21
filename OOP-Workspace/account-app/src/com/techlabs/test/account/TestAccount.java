package com.techlabs.test.account;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("Vinod", 5000);
		account.deposit(500);
		System.out.println("Balance :" + account.getBalance());

		account.withdraw(5000);
		System.out.println("Balance :" + account.getBalance());

		account.withdraw(200);
		printDetails(account);
		
		Account account1=new Account("jack");
	}

	public static void printDetails(Account account) {
		System.out.println("Account Number :" + account.getAccountNumber() + " Name :" + account.getName()
				+ " Account Balance :" + account.getBalance());
	}

}
