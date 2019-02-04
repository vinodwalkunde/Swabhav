package com.techlabs.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlabs.service.BookmarksManger;
import com.techlabs.service.DataManger;

public class BookmarksFrame extends JFrame {
	private Container container;
	private JTextField textField1, textField2;
	private JButton button1, button2;
	private JLabel jLabel1, jLabel2;

	public BookmarksFrame() {
		init();
	}

	public void init() {
		BookmarksManger dataManger = new BookmarksManger();

		JFrame frame = new JFrame("Bookmarks Page");
		container = getContentPane();
		textField1 = new JTextField();
		textField2 = new JTextField();
		button1 = new JButton("Add");
		jLabel1 = new JLabel("Domain Name");
		jLabel2 = new JLabel("URL");
		JPanel jPanel = new JPanel();
		button2 = new JButton("Export");

		jLabel1.setBounds(80, 70, 200, 30);
		jLabel2.setBounds(80, 110, 200, 30);
		textField1.setBounds(300, 70, 200, 30);
		textField2.setBounds(300, 110, 200, 30);
		button1.setBounds(300, 160, 100, 30);
		button2.setBounds(30, 200, 100, 30);
		jPanel.setBounds(10, 250, 450, 400);

		jPanel.setBackground(Color.CYAN);

		frame.add(button1);
		frame.add(jLabel1);
		frame.add(jLabel2);
		frame.add(textField1);
		frame.add(textField2);
		frame.add(jPanel);
		frame.add(button2);
		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField1.getText();
				String url = textField2.getText();

				try {
					dataManger.addBookmarks(name, url);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		};

		ActionListener actionListener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> bookmarksList = new ArrayList<String>();

				try {
					bookmarksList = dataManger.viewBookmarks();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

				JLabel label = new JLabel();
				int size = bookmarksList.size();
				for (int i = 0; i < size; i++) {
					label.setText(label.getText() + "\n<HTML>" + bookmarksList.get(i) + "<HTML>");
				}
				jPanel.add(label);

				// int size = bookmarksList.size();
				// JLabel jLabel[] = new JLabel[size];
				// for (int i = 0; i < size; i++) {
				// jLabel[i] = new JLabel(bookmarksList.get(i));
				// jPanel.add(jLabel[i]);
				// }

				jPanel.validate();
				jPanel.repaint();

			}
		};
		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener2);

		frame.setSize(500, 700);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
