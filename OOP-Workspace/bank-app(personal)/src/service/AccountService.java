package service;

import bean.Account;
import repository.AccountRepository;

public class AccountService {
	private AccountRepository repository = new AccountRepository();
	private BalanceTransferService transfer = new BalanceTransferService();

	public Account retriveAccount(Long accountNumber) {
		return repository.find(accountNumber);
	}

	public Account createAccount(Account account) {
		repository.createAccount(account);
		return account;
	}

	public Account updateAccount(Account account) {
		return repository.updateAccount(account);
	}

//	public Account deleteAccount(Account account) {
//		repository.deleteAccount(account);
//		return account;
//	}
	public void deleteAccount(Long accountNumber) {
	repository.deleteAccount(accountNumber);
		
	}
	
	public void balanceTransfer(Long accountNumber1, Long accountNumber2, double amount) {
		Account account1 = repository.find(accountNumber1);
		Account account2 = repository.find(accountNumber2);
		transfer.transferBalance(account1.getCurrent(), account2.getCurrent(), amount);
	}
}
