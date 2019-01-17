package com.techlabs.student;

public class Student {
	static {
		System.out.println("static block");
		count = 0;
	}
	private String firstName;
	private String lastName;
	private float cgpi;
	private static int count;

	public Student(String firstName, String lastName, float cgpi) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpi = cgpi;
		count++;
	}

	public static int headCount() {
		return count;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getCgpi() {
		return cgpi;
	}

	public int getCount() {
		return count;

	}

}
