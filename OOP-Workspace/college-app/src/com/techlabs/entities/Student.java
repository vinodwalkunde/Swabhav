package com.techlabs.entities;

import java.text.DateFormat;

import com.techlabs.person.Person;

public class Student extends Person {
	private Branch branch;

	public Student(int id, String address, String dob, Branch branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

	public String toString() {
		return super.toString() + " " + this.branch;
	}

}
