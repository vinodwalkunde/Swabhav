package com.techlabs.factory;

public class BMWFactory implements IAutoFactory {
	private static BMWFactory bmwfactory;

	private BMWFactory() {
	}

	public static BMWFactory getInstance() {
		if (bmwfactory == null) {
			bmwfactory = new BMWFactory();
		}
		return bmwfactory;
	}

	@Override
	public IAutomobile make() {
		return new BMW();
	}

}
