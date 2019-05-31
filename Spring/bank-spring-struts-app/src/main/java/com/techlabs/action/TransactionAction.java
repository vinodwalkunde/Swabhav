package com.techlabs.action;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.business.Account;
import com.techlabs.business.Transaction;
import com.techlabs.service.AccountService;

public class TransactionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	AccountService accountService;

	private Transaction transaction = new Transaction();
	private Account account = new Account();

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	private static boolean firstTime;

	static {
		firstTime = true;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String execute() throws Exception {
		System.out.println("transaction execute called");
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		if (session == null || session.getAttribute("login") == null) {
			return "login";
		} else {
			return "success";
		}
	}

	public String executeDo() throws SQLException, ClassNotFoundException {

		System.out.println("trasaction executeDo called");
		System.out.println(transaction.getName() + "..." + transaction.getAmount() + "..." + transaction.getType()
				+ "..." + transaction.getDate());
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		String username = (String) session.getAttribute("userName");
		if (transaction.getType().equalsIgnoreCase("Deposite")) {
			accountService.deposit(accountService.getUser(username), transaction.getAmount());
		}
		if (transaction.getType().equalsIgnoreCase("Withdraw")) {
			accountService.withdraw(accountService.getUser(username), transaction.getAmount());
		}
		System.out.println();
		firstTime = true;
		return SUCCESS;
	}

	public void validate() {
		System.out.println("validating " + transaction.getAmount() + " " + transaction.getType());
		if (firstTime == false) {
			System.out.println("validate called");
			if (transaction.getAmount() == 0) {
				addFieldError("transaction.amount", "Amount is required");
			}
			if (("").equals(transaction.getType()) | transaction.getType() == null) {
				addFieldError("transaction.type", "Type is required");
			}
		}
		firstTime = false;
	}
}
