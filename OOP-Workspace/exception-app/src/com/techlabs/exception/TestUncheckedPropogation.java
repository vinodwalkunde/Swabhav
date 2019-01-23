package com.techlabs.exception;

public class TestUncheckedPropogation {

	public static void main(String[] args) {
		try{
			f1();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End main");
	}
	public static void f1() {
		System.out.println("Inside f1");
		f2();
	}
	public static void f2() {
		System.out.println("Inside f2");
		f3();
	}
	public static void f3() {
		System.out.println("Inside f3");
		throw new RuntimeException("f3 error");
	}

}
