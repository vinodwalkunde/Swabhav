package com.techlabs.test.account;

import com.techlabs.account.Account;

public class TestEquvality {

	public static void main(String[] args) {
		Account account =new Account("Vinod");
		Account account1= new Account("Vinod");
		
		System.out.println(account==account);
		System.out.println(account.equals(account));
		
		System.out.println(account==account1);
		System.out.println(account.equals(account1));
		
		
		
		
	}

}
