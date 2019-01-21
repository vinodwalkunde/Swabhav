package com.techlabs.employee;

public class Accountant extends Employee {
	private double rollParks;

	public Accountant(String name, int empNumber) {
		super(name, empNumber);
	}

	@Override
	public void salary() {
		rollParks = 0.3 * basic;
		salary = rollParks + basic;
	}

	public double getRollParks() {
		return rollParks;
	}

	public String toString() {
		return "Name :" + super.getName() + " Employee Number :" + super.getEmpNumber() + " \nBasic Salary :"
				+ super.getBasic() + "\nRollParks :" + this.rollParks + "\nTotal Salary :" + super.salary;

	}

}
