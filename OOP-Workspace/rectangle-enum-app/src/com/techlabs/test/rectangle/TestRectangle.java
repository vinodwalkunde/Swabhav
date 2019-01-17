package com.techlabs.test.rectangle;

import com.techlabs.rectangle.ColorOptions;
import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20, ColorOptions.GREEN);

		printDetails(rectangle);
		
		printDetails(new Rectangle(12, 24, ColorOptions.RED));
	}

	public static void printDetails(Rectangle rectangle) {
		System.out.println("Height : " + rectangle.getHeight() + " Width : " + rectangle.getWidth() + " Area : "
				+ rectangle.calcuateArea() + " bgColor : " + rectangle.getBgColor());
	}

}
