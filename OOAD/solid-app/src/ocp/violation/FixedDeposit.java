package ocp.violation;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private FestivalType festivalType;
	private int year;

	public FixedDeposit(int accountNumber, String name, double principle, FestivalType festivalType, int year) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principle;
		this.festivalType = festivalType;
		this.year = year;
	}

	public double calculateSimpleInterest() {
		if (this.festivalType == FestivalType.NEWYEAR)
			return 0.75 * principal * year;
		if (this.festivalType == FestivalType.HOLI)
			return 0.80 * principal * year;
		return 0.70 * principal * year;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public int getYear() {
		return year;
	}

}
