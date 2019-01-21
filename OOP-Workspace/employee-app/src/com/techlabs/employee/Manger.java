package com.techlabs.employee;

public class Manger extends Employee {

	private double hra;
	private double ta;

	public Manger(String name, int empNumber) {
		super(name, empNumber);
	}

	@Override
	public void salary() {
		hra = 0.6 * basic;
		ta = 0.3 * basic;
		salary = hra + ta + basic;
	}

	public double getHra() {
		return hra;
	}

	public double getTa() {
		return ta;
	}

	public String toString() {
		return "Name :" + super.getName() + " Employee Number :" + super.getEmpNumber() + " \nBasic Salary :"
				+ super.getBasic() + "\nHouse Rent Allowance :" + this.hra + "\nTravel Allowance :" + this.ta
				+ "\nTotal Salary :" + super.salary;

	}

}
