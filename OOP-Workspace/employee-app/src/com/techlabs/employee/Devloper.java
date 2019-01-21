package com.techlabs.employee;

public class Devloper extends Employee {
	private double pa;

	public Devloper(String name, int empNumber) {
		super(name, empNumber);
	}

	public double getPa() {
		return pa;
	}

	@Override
	public void salary() {
		pa = 0.4 * basic;
		salary = pa + basic;
	}

	public String toString() {
		return "Name :" + super.getName() + " Employee Number :" + super.getEmpNumber() + " \nBasic Salary :"
				+ super.getBasic() + "\nPerformance Allowance :" + this.pa + "\nTotal Salary :" + super.salary;

	}

}
