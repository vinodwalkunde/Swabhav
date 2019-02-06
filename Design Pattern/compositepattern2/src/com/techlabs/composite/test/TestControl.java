package com.techlabs.composite.test;

import com.techlabs.composite.Control;
import com.techlabs.composite.ControlGroup;

public class TestControl {
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		ControlGroup htmlRoot = new ControlGroup("html");
		ControlGroup head=new ControlGroup("head");
		Control title=new Control("title", "New Page");
		
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");

		Control paragraph = new Control("p","Enter Name");
		
		Control paragraph2=new Control("p","Password");

		
		htmlRoot.addItem(head);
		head.addItem(title);
		htmlRoot.addItem(body);
		body.addItem(div);
		div.addItem(paragraph);
		div.addItem(paragraph2);

		htmlRoot.displayDom();
	}
}
