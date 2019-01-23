package com.techlabs.exception;

public class Testpropogation {

	public static void main(String[] args) throws Exception {
		try{
			f1();
		}catch(Exception ex) {
			System.out.println("Exception");
			System.out.println(ex.getStackTrace());
			System.out.println(ex.getMessage());
		}
		System.out.println("End Main");

	}
	public static void f1() throws Exception {
		System.out.println("Inside f1");
		f2();
	}
	public static void f2() throws Exception {
		System.out.println("Inside f2");
		f3();
	}
	public static void f3() throws Exception {
		System.out.println("Inside f3");
		throw new Exception("F3 Error");
	}

}
