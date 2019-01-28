package com.techlabs.tictactoe;

public interface IResultAnalyizer {

	Result checkResult();

	boolean isHorizontal();

	boolean isVertical();

	boolean isDiagonal();

	Result getResult();

	IBoard getBoard();

}