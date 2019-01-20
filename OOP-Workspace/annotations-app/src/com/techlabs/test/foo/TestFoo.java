package com.techlabs.test.foo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.techlabs.foo.Foo;
import com.techlabs.foo.ProTestCase;

public class TestFoo {

	public static void main(String[] args) throws Throwable {
		int count = 0;
		Foo foo = new Foo();
		int passCount=0;
		int failCount=0;

		for (Method method : Foo.class.getMethods()) {
			passCount=passCount+passCount(method,foo);
			failCount=failCount+failCount(method,foo);

		}
		System.out.println("Pass Count : "+passCount);
		System.out.println("Fail Count : "+failCount);
		System.out.println("Number of Annotations :" + (passCount+failCount));

	}
	public static int passCount(Method method,Foo foo) throws Exception, IllegalArgumentException, Throwable {
		if (method.isAnnotationPresent(ProTestCase.class) == true && (boolean) method.invoke(foo, null) == true) {
			System.out.println(method.getName());
			System.out.println("Test Passed");
			return 1;
		}
		return 0;
		}
	public static int failCount(Method method,Foo foo) throws Throwable, IllegalArgumentException, InvocationTargetException {

		if (method.isAnnotationPresent(ProTestCase.class) == true && (boolean) method.invoke(foo, null) == false) {
			System.out.println(method.getName());
			System.out.println("Test Failed");
			return 1;
		}
		return 0;
	}

}
