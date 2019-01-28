package bean;

public class Balance {
	private double amount;

	
	public Balance() {
		super();
	}

	public Balance(double amount) {
		super();
		this.amount = amount;
	}


	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String toString() {
		return String.valueOf(amount);
		
	}
}
