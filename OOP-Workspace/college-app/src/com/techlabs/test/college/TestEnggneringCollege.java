package com.techlabs.test.college;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.techlabs.college.EnggneringCollege;
import com.techlabs.entities.Branch;
import com.techlabs.entities.Professor;
import com.techlabs.entities.Student;

public class TestEnggneringCollege {
	public static void main(String[] args) throws IOException {
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
		htmlGenerator(college);
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

	public static void htmlGenerator(EnggneringCollege college) throws IOException {
		String fileName = "college.html";
		FileWriter filewriter = new FileWriter(fileName, false);
		List<Student> studentList = college.getStudents();
		List<Professor> professorsList = college.getProfessor();
		filewriter.append("<div><h1><strong>College name :Enggnering College</b></h1><strong>" + "\t"
				+ "<div>No of Students in this college :" + college.getStudentCount() + "<br>" + "\t"
				+ "<div>No of Professos in this college :" + college.getProfessorCount() + "<br>");
		filewriter.append("<h2>Student Details</h2>");

		for (Student student : studentList) {
			filewriter.append("<div> ID : " + student.getId() + "</div>" + "<div> Branch " + student.getBranch()
					+ "</div>" + "<div> Address : " + student.getAddress() + "</div>" + "<div> DOB : "
					+ student.getDob() + "</div>");
		}
		filewriter.append("<h2>Professor Details</h2>");
		for (Professor professor : professorsList) {
			filewriter.append("<div> ID : " + professor.getId() + "</div>" + "<div> Address : " + professor.getAddress()
					+ "</div>" + "<div> DOB : " + professor.getDob() + "</div>");
		}
		filewriter.close();
	}

}
