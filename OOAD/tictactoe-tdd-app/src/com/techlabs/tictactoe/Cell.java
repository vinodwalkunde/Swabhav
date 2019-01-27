package com.techlabs.tictactoe;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		// if (mark != Mark.EMPTY) {
		// if (this.mark == Mark.EMPTY) {
		this.mark = mark;
		// } else {
		// throw new RuntimeException("Cell Alrady Marks");
		// }
		// }else
		// throw new RuntimeException("Please Enter valid Input");
	}

}
