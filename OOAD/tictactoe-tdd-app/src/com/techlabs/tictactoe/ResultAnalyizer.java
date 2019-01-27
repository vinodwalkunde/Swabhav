package com.techlabs.tictactoe;

public class ResultAnalyizer {
	private Result result;
	private Board board;

	public ResultAnalyizer(Board board) {
		this.board = board;
	}

	public void hasWon() {
		if (isHorizontal() || isVertical() || isDiagonal()) {
			result = Result.WIN;
		}
		if (board.isEmpty()) {
			result = Result.NOTSTARTED;
		}
		if (board.isFull()) {
			result = Result.DRAW;
		}
		if (result != Result.DRAW && result != Result.WIN && !board.isEmpty()) {
			result = Result.INPROGRESS;
		}
	}

	public boolean isHorizontal() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(1)
				&& board.getCellMark(1) == board.getCellMark(2)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(3) && board.getCellMark(3) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(5)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(6) && board.getCellMark(6) == board.getCellMark(7)
				&& board.getCellMark(7) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	public boolean isVertical() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(3)
				&& board.getCellMark(3) == board.getCellMark(6)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(1) && board.getCellMark(1) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(7)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(5)
				&& board.getCellMark(5) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	public boolean isDiagonal() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(8)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(6)) {
			return true;
		}
		return false;
	}

	public Result getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}
}
