package com.techlabs.tictactoe.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.IResultAnalyizer;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyizer;

class GameTest {

	@Test
	void testForPlayWhenPlayer1WinWithHorizontal() {
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
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenPlayer2WinWithHorizontal() {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(6);
		game.play(0);
		game.play(4);
		game.play(1);
		game.play(7);
		game.play(2);
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenPlayer1WinWithVertical() {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(0);
		game.play(1);
		game.play(3);
		game.play(4);
		game.play(6);
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenPlayer2WinWithVertical() {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(0);
		game.play(2);
		game.play(3);
		game.play(5);
		game.play(4);
		game.play(8);
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenPlayer1WinWithDiagonal() {
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
		game.play(6);
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenPlayer2WinWithDiagonal() {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(1);
		game.play(2);
		game.play(3);
		game.play(4);
		game.play(8);
		game.play(6);
		assertEquals(Result.WIN, resultAnalyizer.getResult());
	}

	@Test
	void testForPlayWhenGameDraw() {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();

		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(0);// x
		game.play(1);// o
		game.play(2);// x
		game.play(4);// o
		game.play(3);// x
		game.play(6);// o
		game.play(5);// x
		game.play(8);// o
		game.play(7);// x
		assertEquals(Result.DRAW, resultAnalyizer.getResult());
	}

}
