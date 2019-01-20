package com.techlabs.foo;

public class Foo {
	@ProTestCase
	public boolean method1() {
		return true;
	}

	@ProTestCase
	public boolean method2() {
		return false;
	}

	public boolean method3() {
		return true;
	}

	@ProTestCase
	public boolean method4() {
		return false;
	}

}
