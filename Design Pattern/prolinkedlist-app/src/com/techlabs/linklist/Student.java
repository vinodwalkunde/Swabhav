package com.techlabs.linklist;

public class Student {
	private String name;
	private String lname;

	public Student(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return name + " " + lname;
	}
}
