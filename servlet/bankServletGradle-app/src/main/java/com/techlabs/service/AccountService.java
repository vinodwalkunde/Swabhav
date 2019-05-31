package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.business.Account;
import com.techlabs.business.Transaction;
import com.techlabs.repository.AccountRespository;

public class AccountService {

	private AccountRespository accountRespository;

	public AccountService(AccountRespository accountRespository) {
		this.accountRespository = accountRespository;
	}

	public Account getLoginUserDetails(String name) {
		return accountRespository.getLoginDetail(name);
	}

	public void registerUser(Account account) throws Exception {
		accountRespository.register(account);
	}

	public void deposit(Account account, int amount) {
		try {
			accountRespository.deposit(account, amount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void withdraw(Account account, int amount) {
		try {
			accountRespository.withdraw(account, amount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Account getUser(String name) {
		return accountRespository.getLoginDetail(name);
	}

	public List<Transaction> accountStatement(String name) {
		try {
			return accountRespository.accountStatement(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
