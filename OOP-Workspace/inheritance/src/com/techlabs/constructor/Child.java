package com.techlabs.constructor;

public class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("Child Created");
	}

	public Child(int foo) {
		super(foo);
		System.out.println("Child Created");
	}
}
