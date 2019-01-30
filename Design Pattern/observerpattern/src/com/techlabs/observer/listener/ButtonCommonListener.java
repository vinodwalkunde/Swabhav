package com.techlabs.observer.listener;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonCommonListener extends JFrame {
	private Container container;
	private JButton jButton1;
	private JButton jButton2;

	public ButtonCommonListener() {
		setTitle("Common Listener");
		setSize(500, 500);
		setLayout(new FlowLayout());
		container = getContentPane();
		jButton1 = new JButton("Red");
//		jButton1.setBounds(100, 100, 100, 30);
		container.add(jButton1);
		jButton2 = new JButton("Blue");
//		jButton2.setBounds(200, 100, 100, 30);
		container.add(jButton2);
		jButton1.addMouseListener((new CommonListener(this)));
//		jButton2.addActionListener(new CommonListener());
//
//		jButton1.addMouseListener(new CommonListener());
		setVisible(true);
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JButton getjButton1() {
		return jButton1;
	}

	public void setjButton1(JButton jButton1) {
		this.jButton1 = jButton1;
	}

	public JButton getjButton2() {
		return jButton2;
	}

	public void setjButton2(JButton jButton2) {
		this.jButton2 = jButton2;
	}
}
