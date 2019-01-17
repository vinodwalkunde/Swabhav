package com.techlabs.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerialization {

	public static void main(String[] args) throws Exception {
		Student student = new Student("Vinod", "Valkunde", 24);

		// serialization
		FileOutputStream file = new FileOutputStream(
				"D:\\Vinod\\Swabhav\\OOP-Workspace\\exercise-app\\src\\com\\techlabs\\serializable\\file.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(student);
		out.close();

		Student studentDeserialization = null;
		// deserialization
		FileInputStream fileInput = new FileInputStream(
				"D:\\Vinod\\Swabhav\\OOP-Workspace\\exercise-app\\src\\com\\techlabs\\serializable\\file.txt");
		ObjectInputStream in = new ObjectInputStream(fileInput);
		studentDeserialization = (Student) in.readObject();
		in.close();

		System.out.println("Object has been deserialized");
		System.out.println(studentDeserialization.getFirstName());
		System.out.println(studentDeserialization.getLastName());
		System.out.println(studentDeserialization.getAge());
	}

}
