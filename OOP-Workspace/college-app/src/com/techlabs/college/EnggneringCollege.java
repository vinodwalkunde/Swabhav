package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.entities.Professor;
import com.techlabs.entities.Student;

public class EnggneringCollege {
	List<Student> students = new ArrayList<Student>();
	List<Professor> professor = new ArrayList<Professor>();

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void addProfessor(Professor professor) {
		this.professor.add(professor);
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Professor> getProfessor() {
		return professor;
	}

	public String toString() {
		return "Student Details" + this.students.toString() + " \nProfessor Details " + this.professor;

	}
	


}
