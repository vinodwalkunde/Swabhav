package com.techlabs.exception;

import com.techlabs.account.Account;

public class InsufficientFundException extends RuntimeException {

	public InsufficientFundException(Account account, double amount) {

		super("Dear Customer Account Number:" + account.getAccountNumber() + " Name:" + account.getName()
				+ " having Balance " + account.getBalance() + " and you tried to withdraw " + amount
				+ " it is not possible");

	}
}
