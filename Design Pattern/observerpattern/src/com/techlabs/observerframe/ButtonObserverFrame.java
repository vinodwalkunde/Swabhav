package com.techlabs.observerframe;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonObserverFrame extends JFrame {
	Container container;
	JButton jButton;
	
	public ButtonObserverFrame() {
		setTitle("Button");
		setSize(500, 500);
		setLayout(null);
		container = getContentPane();
		jButton = new JButton("OK");
		jButton.setBounds(100, 100, 100, 30);
		container.add(jButton);
		jButton.addActionListener(new OkListener());
		jButton.addActionListener(new GoodByeListener());
		setVisible(true);
	}
}
