package com.techlabs.tictactoe.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameConsoleFrame extends JFrame {
	private Container container;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private JLabel jLabel;

	public GameConsoleFrame() {
		container = getContentPane();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");

		button1.setBounds(50, 50, 50, 30);
		button2.setBounds(120, 50, 50, 30);
		button3.setBounds(190, 50, 50, 30);

		button4.setBounds(50, 100, 50, 30);
		button5.setBounds(120, 100, 50, 30);
		button6.setBounds(190, 100, 50, 30);

		button7.setBounds(50, 150, 50, 30);
		button8.setBounds(120, 150, 50, 30);
		button9.setBounds(190, 150, 50, 30);

		container.add(button1);
		container.add(button2);
		container.add(button3);

		container.add(button4);
		container.add(button5);
		container.add(button6);

		container.add(button7);
		container.add(button8);
		container.add(button9);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);

	}

}
