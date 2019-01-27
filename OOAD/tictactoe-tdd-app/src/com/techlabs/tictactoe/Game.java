package com.techlabs.tictactoe;

public class Game {
	private Player player1;
	private Player player2;
	private ResultAnalyizer resultAnalyizer;
	private Board board;
	private boolean currentState = true;

	public Game(ResultAnalyizer resultAnalyizer, Board board, Player player1, Player player2) {
		this.resultAnalyizer = resultAnalyizer;
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play(int index) {
		if (currentState == true) {
			board.setCellMark(index, Mark.CROSS);
			resultAnalyizer.hasWon();
			if (resultAnalyizer.getResult() == Result.WIN) {
				System.out.println("Player 1 WIN");
				return;
				// break;
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				System.out.println("Game DRAW");
				return;
				// break;
			}
		}
		if (currentState == false) {
			board.setCellMark(index, Mark.NOUGHT);
			resultAnalyizer.hasWon();
			if (resultAnalyizer.getResult() == Result.WIN) {
				System.out.println("Player 2 WIN");
				return;
				// break;
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				System.out.println("Game DRAW");
				return;
				// break;
			}
		}
		currentState = !currentState;

	}

}
