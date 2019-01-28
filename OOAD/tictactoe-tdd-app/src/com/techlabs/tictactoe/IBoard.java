package com.techlabs.tictactoe;

public interface IBoard {

	boolean isFull();

	boolean isEmpty();

	void setCellMark(int index, Mark mark);

	Mark getCellMark(int index);

	Cell[] getCells();

}