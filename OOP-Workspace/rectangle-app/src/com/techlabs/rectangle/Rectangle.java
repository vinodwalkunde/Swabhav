package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public int correctBound(int value) {

		if (value <= 0) {
			return 1;
		}
		if (value >= 100) {
			return 100;
		}
		return value;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = correctBound(width);

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = correctBound(height);
	}

	public int calcuateArea() {

		return height * width;
	}
}
