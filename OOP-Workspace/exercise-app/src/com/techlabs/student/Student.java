package com.techlabs.student;

public class Student implements Comparable<Student> {
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
	public int compareTo(Student o) {
		return this.rollNumber - o.rollNumber;
	}

	@Override
	public String toString() {
		return name + " " + rollNumber;
	}
}
