package repository;

import java.util.HashMap;
import java.util.Map;

import bean.Account;
import exception.AccountNotFoundException;
import exception.AccountNumberAlreadyExistsException;

public class AccountRepository {
	private Map<Long, Account> data = new HashMap<>();

	public Account find(Long accountNumber) {
		if (accountNumber == null) {
			throw new IllegalArgumentException("Account number cannot be null");

		}
		if (data.containsKey(accountNumber)) {
			return data.get(accountNumber);
		} else {
			throw new AccountNotFoundException(accountNumber + " This Account Number Not Exists");
		}
	}

	public Account createAccount(Account account) {
		if (account.getAccountNumber() == null) {
			throw new IllegalArgumentException("Account number cannot be null");

		}

		if (data.containsKey(account.getAccountNumber())) {

			throw new AccountNumberAlreadyExistsException(
					account.getAccountNumber() + " This Account Number already Exists");
		} else {
			data.put(account.getAccountNumber(), account);
		}

		return account;
	}

	public Account updateAccount(Account account) {
		find(account.getAccountNumber());
		data.put(account.getAccountNumber(), account);
		return account;
	}

//	public void deleteAccount(Account account) {
//		find(account.getAccountNumber());
//		data.remove(account.getAccountNumber());
	
	public void deleteAccount(Long accountNumber) {
		find(accountNumber);
		data.remove(accountNumber);
	
	}
}
