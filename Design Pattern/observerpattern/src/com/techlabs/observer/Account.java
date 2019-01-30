package com.techlabs.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	private List<IAccountListener> listenerList = new ArrayList<IAccountListener>();

	public Account(String name, int accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void registerListener(IAccountListener accountListener) {
		listenerList.add(accountListener);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		notifyUser();
	}

	public void deposite(double amount) {
		balance = balance + amount;
		notifyUser();
	}

	public String getName() {
		return name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public List<IAccountListener> getListenerList() {
		return listenerList;
	}

	public void notifyUser() {
		for (IAccountListener accountListener : listenerList) {
			accountListener.balanceChange(this);
		}
	}

}
