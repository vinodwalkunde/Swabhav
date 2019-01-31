package com.techlabs.adapter;

import java.util.LinkedList;

public class QueueAdapter<T> implements Iterable<T> {
	private LinkedList<T> queue = new LinkedList<T>();

	public void enquee(T number) {
		queue.addLast(number);
	}

	public T dequee() {
		return queue.removeFirst();
	}

	public int count() {
		return queue.size();

	}

	@Override
	public java.util.Iterator<T> iterator() {
		java.util.Iterator<T> iterator = queue.iterator();
		return iterator;
	}

}
