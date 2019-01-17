package com.techlabs.test.student;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student =new Student("Vinod", "Valkunde", 8.9f);

		Student student1=new Student("Rohit", "Malkar", 7.5f);
		
		Student student2=new Student("Kapil", "Parkar", 7.7f);
		
		System.out.println(student.getRollNumber());
		System.out.println(student1.getRollNumber());
		System.out.println(student2.getRollNumber());
	}


}
