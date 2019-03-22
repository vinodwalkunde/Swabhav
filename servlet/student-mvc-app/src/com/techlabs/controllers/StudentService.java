package com.techlabs.controllers;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	static List<Student> students = new ArrayList<Student>();

	public List<Student> getStudent() {
		// Student student=new Student("Vinod", "Valkunde", 1);
		// Student student2=new Student("Gurang", "Kadam", 2);
		// Student student3=new Student("Ajay","Pandey",3);
		// students.add(student);
		// students.add(student2);
		// students.add(student3);
		return students;
	}

	public void setStudent(Student student) {
		students.add(student);
	}

	public Student getById(int rollnumber) {
		for (Student student2 : students) {
			if (student2.getRollNumber() == rollnumber) {
				return student2;
			}
		}
		return null;
	}
	public void update(Student student) {
		int rollnumber=student.getRollNumber();
		StudentService service=new StudentService();
		service.delete(rollnumber);
		service.setStudent(student);
	}
	public void delete(int rollnumber) {
		StudentService service=new StudentService();
		Student student2=service.getById(rollnumber);
		students.remove(student2);
	}
}
