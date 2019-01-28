package com.techlabs.tictactoe.test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyizer;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyizer;

public class TestTicTacToe {

	public static void main(String[] args) {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(0);
		game.play(1);
		game.play(4);
		game.play(2);
		game.play(8);
		System.out.println(resultAnalyizer.getResult());

	}

}
