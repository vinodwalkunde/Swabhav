package com.techlabs.test.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.techlabs.student.Student;

public class TestStudentIterable {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Vinod", 1));
		studentList.add(new Student("Rohit", 5));
		studentList.add(new Student("Prachit", 3));
		studentList.add(new Student("Gurang", 6));

		Iterator<Student> iter = studentList.iterator();

		while (iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student);
		}

	}

}
