package com.techlabs.factory.test;

import com.techlabs.factory.BMWFactory;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;

public class TestAutoFactory {

	public static void main(String[] args) {
		IAutoFactory autoFactory = BMWFactory.getInstance();
		IAutomobile bmw = autoFactory.make();
		bmw.start();
		bmw.stop();

	}

}
