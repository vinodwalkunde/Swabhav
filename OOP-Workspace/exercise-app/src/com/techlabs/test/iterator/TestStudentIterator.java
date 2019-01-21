package com.techlabs.test.iterator;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.iterable.IterableStudent;
import com.techlabs.iterable.Student;

public class TestStudentIterator {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Vinod", 1));
		studentList.add(new Student("Rohit", 5));
		studentList.add(new Student("Prachit", 3));
		studentList.add(new Student("Gurang", 6));

		//IterableStudent iter=new IterableStudent(studentsList1);
	}

}
