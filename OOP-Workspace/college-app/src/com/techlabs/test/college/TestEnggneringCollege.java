package com.techlabs.test.college;

import java.util.List;

import com.techlabs.college.EnggneringCollege;
import com.techlabs.entities.Branch;
import com.techlabs.entities.Professor;
import com.techlabs.entities.Student;

public class TestEnggneringCollege {
	public static void main(String[] args) {
		Student student = new Student(1, "parel", "10.10.12", Branch.IT);
		Student student1 = new Student(2, "Andheri", "11.11.11", Branch.EXTC);
		Student student2 = new Student(3, "Lalbag", "10.11.12", Branch.COMPUTER);
		Student student3 = new Student(12, "Kurla", "12.4.17", Branch.MECHANICAL);

		Professor professor = new Professor(10, "parel", "1.2.91");
		Professor professor2 = new Professor(12, "navi Mumbai", "12.4.94");
		professor.calculateSalary();
		professor2.calculateSalary();

		EnggneringCollege college = new EnggneringCollege();

		college.addStudent(student);
		college.addStudent(student1);
		college.addStudent(student2);
		college.addStudent(student3);

		college.addProfessor(professor);
		college.addProfessor(professor2);
		
		printDetails(college);
	}

	public static void printDetails(EnggneringCollege college) {
		List<Student> studentList = college.getStudents();
		List<Professor> professorsList = college.getProfessor();
		System.out.println("Student Details");
		for (Student studentL : studentList) {
			System.out.println(studentL);
		}
		System.out.println("Professor Details");
		for (Professor professorL : professorsList) {
			System.out.println(professorL);
		}
	}
}
