package com.techlabs.test.account;

import com.techlabs.account.Account;

public class TestToString {
	public static void main(String[] args) {
		Account account=new Account("jack");
		System.out.println(account.toString());
		System.out.println(account);
	}
}
