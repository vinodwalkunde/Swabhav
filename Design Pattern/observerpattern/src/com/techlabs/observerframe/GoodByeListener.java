package com.techlabs.observerframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodByeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("GoodBye");
	}

}
