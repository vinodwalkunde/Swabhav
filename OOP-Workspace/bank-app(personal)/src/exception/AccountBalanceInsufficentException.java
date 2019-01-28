package exception;

public class AccountBalanceInsufficentException extends RuntimeException {
	public AccountBalanceInsufficentException(String msg) {
		super(msg);
	}

}
