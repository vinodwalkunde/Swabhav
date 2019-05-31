package com.techlabs.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.business.Account;
import com.techlabs.service.AccountService;

public class RegisterAction extends ActionSupport {
	@Autowired
	AccountService service;
	
	Account account;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;

	}
	
	public String executeDo() throws Exception {

		System.out.println("register executeDo called");
		System.out.println(account.getName() + "..." + account.getBalance() + "..." + account.getPassword());
		service.registerUser(account);
		HttpServletRequest request = ServletActionContext.getRequest();
		return SUCCESS;
	}

	public AccountService getService() {
		return service;
	}

	public void setService(AccountService service) {
		this.service = service;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
