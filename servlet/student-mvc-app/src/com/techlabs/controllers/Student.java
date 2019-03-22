package com.techlabs.controllers;

public class Student {
	private String name;
	private String lastName;
	private int rollNumber;

	public Student(String name, String lastName, int rollNumber) {
		this.name = name;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return rollNumber + " " + name + " " + lastName;
	}

}
