package com.techlabs.hashset;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.student.Student;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();
		Student student1 = new Student(1, "Vinod", "Walkunde");
		Student student2 = new Student(1, "Vinod", "Walkunde");
		
		students.add(student1);
		students.add(student1);
		students.add(student2);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(students.size());
	}

}
