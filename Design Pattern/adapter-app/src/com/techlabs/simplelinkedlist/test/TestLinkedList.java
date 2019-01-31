package com.techlabs.simplelinkedlist.test;

import com.techlabs.simplelinkedlist.Node;

public class TestLinkedList {

	public static void main(String[] args) {
		Node<Integer> first = new Node<Integer>();
		first.setData(10);

		Node<Integer> second = new Node<Integer>();
		second.setData(20);

		Node<Integer> third = new Node<Integer>();
		third.setData(30);

		first.setNext(second);
		second.setNext(third);
		third.setNext(null);

		printDetails(first);
	}

	public static <T> void printDetails(Node<T> node) {
		Node<T> temp = node;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();

		}
	}

}
