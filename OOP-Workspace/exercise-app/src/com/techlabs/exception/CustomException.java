package com.techlabs.exception;

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new VinodException("My Own Custom Exception");
			
		} catch (VinodException ex) {
			System.err.println("Exception Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}

}
