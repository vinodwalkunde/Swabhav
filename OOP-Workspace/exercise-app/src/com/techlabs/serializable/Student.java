package com.techlabs.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	private String firstName;
	private String lastName;
	private int age;

	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

}
