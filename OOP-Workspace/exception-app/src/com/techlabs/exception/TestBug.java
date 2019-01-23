package com.techlabs.exception;

public class TestBug {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Value is" + c);

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter Value Through args");
			System.out.println(ex.getMessage());
		} catch (ArithmeticException ex2) {
			System.out.println("Number can not divde by Zero");
			System.out.println(ex2.getMessage());
		} catch (NumberFormatException ex3) {
			System.out.println("Please give int value");
			System.out.println(ex3.getMessage());
		}
		// TestBug.main(args);
		System.out.println("Thank You");

	}

}
