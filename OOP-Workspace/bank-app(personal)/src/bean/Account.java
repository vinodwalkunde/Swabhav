package bean;

public abstract class Account {
	private final Long accountNumber;
	private Balance current;
	private Balance ledger;
	private AccountDetail accountDetail;

	public Account(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Balance getCurrent() {
		return current;
	}

	public void setCurrent(Balance current) {
		this.current = current;
	}

	public Balance getLedger() {
		return ledger;
	}

	public void setLedger(Balance ledger) {
		this.ledger = ledger;
	}

	public AccountDetail getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(AccountDetail accountDetail) {
		this.accountDetail = accountDetail;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public String toString() {
		return accountNumber + " " + current + " " + ledger + " " + accountDetail;

	}
}
