package com.techlabs.test.account;

import com.techlabs.account.Account;
import com.techlabs.exception.InsufficientFundException;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("Vinod", 5000);

		account.deposit(500);
		System.out.println("Balance :" + account.getBalance());

		try {
			account.withdraw(5000);
			System.out.println("Balance :" + account.getBalance());

			account.withdraw(20000);
			printDetails(account);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void printDetails(Account account) {
		System.out.println("Account Number :" + account.getAccountNumber() + " Name :" + account.getName()
				+ " Account Balance :" + account.getBalance());
	}

}
