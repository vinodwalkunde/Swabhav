package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class TestRectangle {

	public static void main(String[] args) {
		shouldNotChangeWhenWidthchange(new Rectangle(30, 10));
		shouldNotChangeWhenWidthchange(new Square(30));
	}

	public static void shouldNotChangeWhenWidthchange(Rectangle rectangle) {
		int before = rectangle.getWidth();
		rectangle.setHeight(100);
		int after = rectangle.getWidth();
		System.out.println("Before:" + before);
		System.out.println("After:" + after);
	}

}
