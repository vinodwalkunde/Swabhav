package com.techlabs.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogicUnit {
	@Test
	public void cubeOfEven() {
		Calculator calculator = new Calculator();

		int actualResult = (int) calculator.cubeOfEven(2);
		assertEquals(8, actualResult);
	}

}
