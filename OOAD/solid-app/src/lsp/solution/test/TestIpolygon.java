package lsp.solution.test;

import lsp.solution.Rectangle;
import lsp.solution.Square;

public class TestIpolygon {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(30, 10);
		Square square=new Square(30);
		shouldNotChangeWhenWidthchange(rectangle);
	}

	public static void shouldNotChangeWhenWidthchange(Rectangle rectangle) {
		int before = rectangle.getWidth();
		rectangle.setHeight(100);
		int after = rectangle.getWidth();
		System.out.println("Before:" + before);
		System.out.println("After:" + after);
	}
}
