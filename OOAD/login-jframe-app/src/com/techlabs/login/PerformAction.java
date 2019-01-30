package com.techlabs.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PerformAction implements ActionListener {
	LoginForm loginForm;

	public PerformAction(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String uname = loginForm.tf1.getText();
		String pass = loginForm.p1.getText();
		if (uname.equals(pass)) {
			Welcome welcome = new Welcome();
			welcome.setVisible(true);
			JLabel label = new JLabel("Welcome:" + uname);
			welcome.getContentPane().add(label);
		}
	}

}
