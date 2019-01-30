package com.techlabs.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	JLabel l1, l2, l3;
	JTextField tf1;
	JButton btn1;
	JPasswordField p1;

	public LoginForm() {
		JFrame frame = new JFrame("Login Page");
		l1 = new JLabel("Login Form");
		l1.setBackground(Color.BLUE);

		l2 = new JLabel("UserName");
		l3 = new JLabel("Password");
		tf1 = new JTextField();
		p1 = new JPasswordField();
		btn1 = new JButton("Login");

		l1.setBounds(100, 30, 400, 30);
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		p1.setBounds(300, 110, 200, 30);
		btn1.setBounds(150, 160, 100, 30);

		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(l3);
		frame.add(p1);
		frame.add(btn1);
		btn1.addActionListener(new PerformAction(this));

		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
