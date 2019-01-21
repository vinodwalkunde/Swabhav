package com.techlabs.test.comparable;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Vinod", 1));
		studentList.add(new Student("Rohit", 5));
		studentList.add(new Student("Prachit", 3));
		studentList.add(new Student("Gurang", 6));
		
		Collections.sort(studentList);
		for(Student student:studentList) {
			System.out.println("Roll Number:"+student.getRollNumber()+" Name :"+student.getName());
		}
	}

}
