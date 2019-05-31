package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.business.Account;
import com.techlabs.business.Transaction;
import com.techlabs.repository.AccountRespository;

@Service("Service")
public class AccountService {
	@Autowired
	private AccountRespository accountRespository;

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
