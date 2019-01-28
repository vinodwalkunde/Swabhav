package test;

import bean.Account;
import bean.AccountDetail;
import bean.Balance;
import bean.CurrentAccount;
import bean.SavingsAccount;
import service.AccountService;

public class BankMainClass {

	public static void main(String[] args) {
		AccountService service = new AccountService();

		Account a1 = new SavingsAccount(123L);
		a1.setCurrent(new Balance(10));
		a1.setLedger(new Balance(20));
		AccountDetail accountDetail = new AccountDetail();
		accountDetail.setName("jack");
		accountDetail.setAdress("Parel");
		a1.setAccountDetail(accountDetail);

		Account a2 = new CurrentAccount(111L);
		a2.setCurrent(new Balance(50));
		a2.setLedger(new Balance(100));

		Account a3 = new SavingsAccount(112L);
		a3.setCurrent(new Balance(50));
		a3.setLedger(new Balance(100));

		service.createAccount(a1);
		service.createAccount(a2);
		service.createAccount(a3);
		service.balanceTransfer(112L, 123L, 1);
		service.balanceTransfer(112L, 123L, 10);
		service.balanceTransfer(112L, 123L, 40);
		

		System.out.println(service.retriveAccount(123L));
		System.out.println(service.retriveAccount(112L));
	}
}
