package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import bean.Account;
import bean.Balance;
import bean.CurrentAccount;
import bean.SavingsAccount;
import service.AccountService;

public class MultiThreadTest {

	static AccountService service = new AccountService();

	public static void main(String[] args) {
	

		Account a1 = new SavingsAccount(123L);
		a1.setCurrent(new Balance(9999));
		service.createAccount(a1);

		Account a2 = new CurrentAccount(111L);
		a2.setCurrent(new Balance(0));
		a2.setLedger(new Balance(100));
		service.createAccount(a2);

		Account a3 = new CurrentAccount(112L);
		a3.setCurrent(new Balance(0));
		a3.setLedger(new Balance(100));
		service.createAccount(a3);

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		int i;

		for (i = 0; i < 10000; i++) {
			executorService.submit(new TransactionTask(service, 123, 111, 10));
			executorService.submit(new TransactionTask(service, 123, 112, 10));
		}
		System.out.println(i);
		executorService.shutdown();
		try {
			executorService.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println(service.retriveAccount(123L));
		System.out.println(service.retriveAccount(111L));
		System.out.println(service.retriveAccount(112L));
	}

}

class TransactionTask implements Runnable {
	AccountService service;
	long fromAccountNumber, toAccountNumber, amount;

	public TransactionTask(AccountService service, long fromAccountNumber, long toAccountNumber, long amount) {
		super();
		this.service = service;
		this.fromAccountNumber = fromAccountNumber;
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
	}

	@Override
	public void run() {
		service.balanceTransfer(fromAccountNumber, toAccountNumber, amount);
	}

}
