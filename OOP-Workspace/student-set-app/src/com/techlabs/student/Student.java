package com.techlabs.student;

public class Student implements Comparable<Student> {
	private int rollno;
	private String firstName;
	private String lastName;

	public Student(int rollno, String firstName, String lastName) {
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		if (o.rollno > this.rollno) {
			return 1;
		}
		if (o.rollno < this.rollno) {
			return -1;
		}
		return 0;

	}

}
