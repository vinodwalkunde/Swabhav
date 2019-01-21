package com.techlabs.employee;

public abstract class Employee {
	private String name;
	private int empNumber;
	protected double basic = 10000;
	protected double salary;

	public Employee(String name, int empNumber) {
		this.name = name;
		this.empNumber = empNumber;
	}

	public abstract void salary();

	public String getName() {
		return name;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public double getBasic() {
		return basic;
	}

}
