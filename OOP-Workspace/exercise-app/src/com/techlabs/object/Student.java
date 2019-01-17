package com.techlabs.object;

public class Student implements Cloneable {
	String firstName = "Rohit";

	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();

	}
}
