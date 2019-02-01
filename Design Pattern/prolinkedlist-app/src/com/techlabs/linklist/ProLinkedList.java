package com.techlabs.linklist;

public class ProLinkedList<T> {
	private Node head;
	private int listCount;

	public ProLinkedList(T data) {
		head = new Node(data);
		listCount = 0;
	}

	public void print() {
		Node current = head;
		while (current.getNext() != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	public void add(T d) {
		Node end = new Node(d);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
		listCount++;
	}

	public void deleteNodeWithData(T d) {
		Node current = head;
		while (current.getNext() != null) {
			if (current.getNext().getData() == d) {
				current.setNext(current.getNext().getNext());
				listCount--;
			}
			current = current.getNext();
		}
//		System.out.println("Delete Failed: No node found with given data!");
	}

}
