package com.techlabs.test.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.techlabs.student.Student;

public class TestStudentIterable {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Vinod", 1));
		studentList.add(new Student("Rohit", 5));
		studentList.add(new Student("Prachit", 3));
		studentList.add(new Student("Gurang", 6));

		Comparator<Student> rollNumberCompare = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getRollNumber() - o2.getRollNumber());
			}

		};
		Collections.sort(studentList, rollNumberCompare);
		
		for (Student student : studentList) {
			System.out.println("Roll Number:" + student.getRollNumber() + " Name :" + student.getName());
		}
	}

}
