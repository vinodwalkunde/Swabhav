package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyizer;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyizer;

class TestResultAnalyizer {

	@Test
	void testForIsHorizontalForFirstLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(2, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalForFirstLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.NOUGHT);
		board.setCellMark(1, Mark.NOUGHT);
		board.setCellMark(2, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalForSecondLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(3, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalForSecondLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(3, Mark.NOUGHT);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(5, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalForThirdLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(6, Mark.CROSS);
		board.setCellMark(7, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalForThirdLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(6, Mark.NOUGHT);
		board.setCellMark(7, Mark.NOUGHT);
		board.setCellMark(8, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalWhenTestFailWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		assertEquals(false, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsHorizontalWhenTestFailWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.NOUGHT);
		board.setCellMark(1, Mark.NOUGHT);
		board.setCellMark(4, Mark.NOUGHT);
		assertEquals(false, resultAnalyizer.isHorizontal());
	}

	@Test
	void testForIsVerticalWhenFirstLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(3, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenFirstLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.NOUGHT);
		board.setCellMark(3, Mark.NOUGHT);
		board.setCellMark(6, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenSecondLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(7, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenSecondLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(1, Mark.NOUGHT);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(7, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenThirdLineWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenThirdLineWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.NOUGHT);
		board.setCellMark(5, Mark.NOUGHT);
		board.setCellMark(8, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsVerticalWhenTestFail() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		assertEquals(false, resultAnalyizer.isVertical());
	}

	@Test
	void testForIsDigonalWhenFirstWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isDiagonal());
	}

	@Test
	void testForIsDigonalWhenFirstWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.NOUGHT);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(8, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isDiagonal());
	}

	@Test
	void testForIsDigonalWhenSecondWithCross() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		assertEquals(true, resultAnalyizer.isDiagonal());
	}

	@Test
	void testForIsDigonalWhenSecondWithNought() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.NOUGHT);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(6, Mark.NOUGHT);
		assertEquals(true, resultAnalyizer.isDiagonal());
	}

	@Test
	void testForIsDigonalWhenTestFail() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(8, Mark.CROSS);
		assertEquals(false, resultAnalyizer.isDiagonal());
	}

	@Test
	void testForCheckResultWhenWin() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.CROSS);
		board.setCellMark(6, Mark.CROSS);
		assertEquals(Result.WIN, resultAnalyizer.checkResult());
	}

	@Test
	void testForCheckResultWhenNotStarted() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		assertEquals(Result.NOTSTARTED, resultAnalyizer.checkResult());
	}

	@Test
	void testForCheckResultWhenDraw() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		board.setCellMark(0, Mark.CROSS);
		board.setCellMark(1, Mark.NOUGHT);
		board.setCellMark(2, Mark.CROSS);
		board.setCellMark(4, Mark.NOUGHT);
		board.setCellMark(3, Mark.CROSS);
		board.setCellMark(6, Mark.NOUGHT);
		board.setCellMark(5, Mark.CROSS);
		board.setCellMark(8, Mark.NOUGHT);
		board.setCellMark(7, Mark.CROSS);
		assertEquals(Result.DRAW, resultAnalyizer.checkResult());
	}

}
