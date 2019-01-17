package com.techlabs.keywords;

public class OtherClass {
	private final int number; // It can be modify with Constructor
	private static final int sfnumber = 100; // Constant

	public OtherClass(int n) {
		number = n;
	}

	public void print() {
		System.out.println("Value of Final Variable=" + number);
		System.out.println("Value of Static Final Variable=" + sfnumber);
	}
}
