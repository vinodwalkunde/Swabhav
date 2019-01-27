package com.techlabs.tictactoe;

public class Board {
	private Cell[] cells = new Cell[9];

	public Board() {
		for (int index = 0; index < cells.length; index++) {
			cells[index] = new Cell();
		}
	}

	public boolean isFull() {
		for (int index = 0; index < 9; index++) {
			if (cells[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}

	public boolean isEmpty() {
		for (int index = 0; index < 9; index++) {
			if (cells[index].getMark() == Mark.CROSS || cells[index].getMark() == Mark.NOUGHT) {
				return false;
			}
		}
		return true;
	}

	public void setCellMark(int index, Mark mark) {
		cells[index].setMark(mark);
	}

	public Mark getCellMark(int index) {
		return cells[index].getMark();

	}

	public Cell[] getCells() {
		return cells;
	}

}
