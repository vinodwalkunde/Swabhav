package com.techlabs.observer.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommonListener implements ActionListener, MouseListener {
	ButtonCommonListener buttonCommonListener;

	public CommonListener(ButtonCommonListener buttonCommonListener) {
		this.buttonCommonListener = buttonCommonListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		buttonCommonListener.getContainer().setBackground(Color.BLUE);
//		e.getComponent().setBackground(Color.blue);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		buttonCommonListener.getContainer().setBackground(Color.BLUE);
		e.getComponent().setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		e.getComponent().setBackground(Color.CYAN);
	}

}
