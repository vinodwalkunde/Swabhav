package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;

class CellTest {

	@Test
	void testOgetMark() {
		Cell cell = new Cell();
		cell.setMark(Mark.NOUGHT);
		Mark result = cell.getMark();
		assertEquals(Mark.NOUGHT, result);
	}

	@Test
	void testXgetMark() {
		Cell cell = new Cell();
		cell.setMark(Mark.CROSS);
		Mark result = cell.getMark();
		assertEquals(Mark.CROSS, result);
	}

}
