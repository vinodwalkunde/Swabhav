package com.techlabs.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableStudent implements Iterable<Student> {
	ArrayList<Student> studentList;

	public IterableStudent(ArrayList<Student> studentsList) {
		this.studentList=studentsList;
	}

	@Override
	public Iterator<Student> iterator() {
		return studentList.iterator();
	}
}
