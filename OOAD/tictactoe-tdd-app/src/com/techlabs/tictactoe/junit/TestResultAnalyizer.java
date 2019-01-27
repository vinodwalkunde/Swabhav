package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.ResultAnalyizer;

class TestResultAnalyizer {

	@Test
	void testForIsHorizontal() {
		Board board = new Board();
		ResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(2, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

}
