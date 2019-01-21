package com.techlabs.test.account;

import com.techlabs.account.Account;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account account =new Account("Vinod");
		Account account1= (Account) account.Clone();
		
		System.out.println(account==account1);
		System.out.println(account.equals(account1));
		System.out.println(account.hashCode());
		System.out.println(account1.hashCode());
		
		Account account3=account1;
		
		System.out.println(account3==account1);
		System.out.println(account3.equals(account1));
		
		System.out.println(account3.hashCode());
		System.out.println(account1.hashCode());
		
	}

}
