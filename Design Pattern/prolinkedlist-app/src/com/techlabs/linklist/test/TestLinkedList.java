package com.techlabs.linklist.test;

import com.techlabs.linklist.ProLinkedList;
import com.techlabs.linklist.Student;

public class TestLinkedList {

	public static void main(String[] args) {
		Student student1 = new Student("Vinod", "Valkunde");
		Student student2 = new Student("rohit", "pawar");
		Student student3=new Student("prachit", "Abc");
		ProLinkedList<Student> studentsList = new ProLinkedList<Student>(student1);
		studentsList.add(student2);
	
		studentsList.add(student3);
		
		studentsList.deleteNodeWithData(student2);
		studentsList.print();

	}

}
