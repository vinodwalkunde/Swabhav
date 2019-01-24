package com.techlabs.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.Student;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<Student> students ;
		students=new TreeSet<Student>(new LastNameCompartor());
		Student student1 = new Student(1, "Vinod", "Walkunde");
		Student student2 = new Student(2, "Rohit", "pawar");
		Student student3 = new Student(3, "Ajay", "koli");
		Student student4 = new Student(4, "Prachit", "kandagle");

		students.add(student1);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(students.size());

		for(Student student:students) {
			System.out.println(student.getLastName());
		}
	}

}
