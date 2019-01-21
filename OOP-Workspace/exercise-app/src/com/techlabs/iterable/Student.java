package com.techlabs.iterable;


public class Student{
	private String name;
	private int rollNumber;

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	@Override
	public String toString() {
		return name + " " + rollNumber;
	}

}
