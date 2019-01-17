package com.techlabs.object;

public class DifferentWaysCreateObject {

	public static void main(String[] args) throws Exception {
		//with Class
		Class cls = Class.forName("Student");
		Student student = (Student) cls.newInstance();
		System.out.println(student.firstName);

		//Cloneable
		Student student1=(Student) student.Clone();
		System.out.println(student1.firstName);
	}

}
