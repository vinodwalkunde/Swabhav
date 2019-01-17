package com.techlabs.student;

public class Student {
	static {
		count=0;
		rollNumberCounter=1001;
	}
	private String firstName;
	private String lastName;
	private float cgpa;
	private static int count;
	private int rollNumber;
	private static int rollNumberCounter;
	
	public Student(String firstName,String lastName,float cgpi) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.cgpa=cgpi;
		count++;
		rollNumber=rollNumberCounter++;
	}
	public int getRollNumber() {
		return rollNumber;
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
	
	public float getCgpa() {
		return cgpa;
	}
	public int getCount() {
		return count;
		
	}
	

}
