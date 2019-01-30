package com.techlabs.factoryproblem.test;

import com.techlabs.factoryproblem.AutoCarType;
import com.techlabs.factoryproblem.AutomobileFactory;
import com.techlabs.factoryproblem.IAutomobile;

public class TestAutomobile {

	public static void main(String[] args) {
		AutomobileFactory automobileFactory = AutomobileFactory.getInstance();
		IAutomobile bmw = automobileFactory.make(AutoCarType.BMW);
		bmw.start();
		bmw.stop();
		System.out.println(bmw.getClass());
	}

}
