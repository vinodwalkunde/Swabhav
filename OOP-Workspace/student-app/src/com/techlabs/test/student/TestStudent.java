package com.techlabs.test.student;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student =new Student("Vinod", "Valkunde", 8.9f);
		System.out.println("Number Of Student : "+student.getCount());
		System.out.println("head count :"+Student.headCount());
		
		Student student1=new Student("Rohit", "Malkar", 7.5f);
		System.out.println("Number of student : "+student1.getCount());
		System.out.println("head count :"+Student.headCount());
		
		Student student2=new Student("Kapil", "Parkar", 7.7f);
		System.out.println("Number Of student : "+student2.getCount());
		System.out.println("head count :"+Student.headCount());
	}


}
