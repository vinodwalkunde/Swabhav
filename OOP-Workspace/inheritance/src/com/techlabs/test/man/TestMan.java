package com.techlabs.test.man;

import com.techlabs.man.Boy;
import com.techlabs.man.Infant;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class TestMan {

	public static void main(String[] args) {
		case1();
		case2();
		
	}
	public static void case1() {
		Man man;
		man =new Man();
		man.eat();
		man.play();
		man.read();
		
	}
	public static void case2() {
		Boy boy;
		boy=new Boy();
		boy.eat();
		boy.play();
		boy.read();
		boy.walk();
	}
	public static void case3() {
		Man x;
		x=new Boy();
		x.play();
		x.read();
	}
	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	public static void atThePark(Man x) {
		System.out.println("At The Park");
		x.play();
	}

}
