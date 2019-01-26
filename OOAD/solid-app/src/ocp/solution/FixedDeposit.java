package ocp.solution;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private IFestivalRateCalculation iFestivalRateCalculation;
	private int year;

	public FixedDeposit(int accountNumber, String name, double principle, int year,
			IFestivalRateCalculation iFestivalRateCalculation) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principle;
		this.year = year;
		this.iFestivalRateCalculation = iFestivalRateCalculation;
	}

	public double calculateSimpleInterest() {
		return principal * year * iFestivalRateCalculation.calculateRate();

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

	public int getYear() {
		return year;
	}

}
