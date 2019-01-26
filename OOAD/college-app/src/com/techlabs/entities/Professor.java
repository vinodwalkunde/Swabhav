package com.techlabs.entities;

import java.text.DateFormat;

import com.techlabs.person.Person;

public class Professor extends Person implements ISalariedEmployee {
	private double totalSalary;
	private double hra;

	public double getTotalSalary() {
		return totalSalary;
	}

	public double getHra() {
		return hra;
	}

	public Professor(int id, String address, String dob) {
		super(id, address, dob);
	}

	@Override
	public void calculateSalary() {
		hra = 0.4 * basic;
		totalSalary = basic + hra;
	}

	@Override
	public String toString() {
		return super.toString()+" "+this.totalSalary;
	}

}
