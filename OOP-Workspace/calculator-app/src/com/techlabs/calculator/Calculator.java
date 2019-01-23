package com.techlabs.calculator;

public class Calculator {

	public double cubeOfEven(int number) {
		if (number < 0) {
			throw new NumberNotEvenExeption("Dont enter negative numbers");
		}
		if (number % 2 == 1 && number < 0) {
			throw new NumberNotEvenExeption("Dont enter negative numbers");
		}
		if (number % 2 == 1) {
			throw new NumberNotEvenExeption("Dont Enter odd numbers");
		}
		return number * number * number;
	}
}
