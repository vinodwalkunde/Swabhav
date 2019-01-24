package com.techlabs.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogicUnit {
	@Test
	public void testForPositiveEvenNumber() {
		Calculator calculator = new Calculator();

		int actualResult = (int) calculator.cubeOfEven(2);
		assertEquals(8, actualResult);
	}
	@Test
	public void testForNegativeEvenNumber() {
		Calculator calculator = new Calculator();
		long actual=(long) calculator.cubeOfEven(-4);
		assertEquals(-64, actual);
	}

}
