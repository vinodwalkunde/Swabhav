package com.techlabs.test.account;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class TestAccount {

	public static void main(String[] args) {
		
		SavingAccount savingaccount = new SavingAccount(1, "Vinod", 20000);
		System.out.println(savingaccount.getBalance());
		printDetails(savingaccount);
		
		CurrentAccount currentaccount=new CurrentAccount(2, "Prachit", 1000);
		printDetails(currentaccount);
		
		currentaccount.withdraw(3000);
		printDetails(currentaccount);
	}

	public static void printDetails(Account account) {
		System.out.println("Account Number :" + account.getAccountNumber() + " Name :" + account.getName()
				+ " Account Balance :" + account.getBalance());
	}

}
