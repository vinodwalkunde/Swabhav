package com.techlabs.adapter.test;

import com.techlabs.adapter.QueueAdapter;

public class TestQueueAdapter {

	public static void main(String[] args) {
		QueueAdapter<Integer> adapter = new QueueAdapter<Integer>();
		adapter.enquee(10);
		adapter.enquee(20);
		adapter.enquee(30);
		System.out.println(adapter.dequee());
		System.out.println("Count:" + adapter.count());

		for (Integer integer : adapter) {
			System.out.println(integer);
		}

		QueueAdapter<String> adapter2 = new QueueAdapter<String>();
		adapter2.enquee("Hii");
		adapter2.enquee("Hello");
		adapter2.enquee("Bye");
		System.out.println(adapter2.dequee());
		System.out.println("Count:" + adapter2.count());

		for (String string : adapter2) {
			System.out.println(string);
		}
	}

}
