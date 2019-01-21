package com.techlabs.constructor;

public class Parent {
	int foo;
	public Parent(int foo) {
		this.foo=foo;
		System.out.println("Parent Created");
	}
	public int getFoo() {
		return foo;
	}
	
}
