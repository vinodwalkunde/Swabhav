package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private ColorOptions bgColor=ColorOptions.BLUE;
	
	public Rectangle(int width,int height,ColorOptions bgColor) {
		this.width=width;
		this.height=height;
		this.bgColor=bgColor;
		
	}
	public ColorOptions getBgColor() {
		return bgColor;
	}
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calcuateArea() {

		return height * width;
	}
}
