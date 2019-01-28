package service;

import bean.Balance;
import exception.AccountBalanceInsufficentException;

public class BalanceTransferService {
	public void transferBalance(Balance from, Balance to, double amount) {
		if (from == null || to == null) {
			throw new IllegalArgumentException("Balance should not be NULL");
		}
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount cannot be less than zero or equal to zero");
		}
		if (from.getAmount() < amount) {
			throw new AccountBalanceInsufficentException("Account balance insufficent");
		}

		synchronized (this) {
			if (from.getAmount() < amount) {
				throw new AccountBalanceInsufficentException("Account balance insufficent");
			}

			double a1 = from.getAmount();
			a1 -= amount;
			double a2 = to.getAmount();
			a2 += amount;
			from.setAmount(a1);
			to.setAmount(a2);
		}

	}
}
