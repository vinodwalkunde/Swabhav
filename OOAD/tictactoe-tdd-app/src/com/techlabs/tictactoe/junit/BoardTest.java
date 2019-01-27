package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Mark;

class BoardTest {

	@Test
	void testForIsEmpty() {
		Board board = new Board();
		boolean result = board.isEmpty();
		assertEquals(result, true);
	}

	@Test
	public void testIsBoardFull() {
		Board board = new Board();
		assertEquals(false, board.isFull());
	}

	@Test
	public void testForCellSetMark() {
		Board board = new Board();
		board.setCellMark(2, Mark.CROSS);
		Mark actual = board.getCellMark(2);
		assertEquals(Mark.CROSS, actual);
	}

}
