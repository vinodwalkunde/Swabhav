package com.techlabs.factory;

public class MiniCooperFactory implements IAutoFactory {
	private static MiniCooperFactory minicooper;

	private MiniCooperFactory() {

	}

	public static MiniCooperFactory getInstance() {
		if (minicooper == null) {
			minicooper = new MiniCooperFactory();
		}
		return minicooper;
	}

	@Override
	public IAutomobile make() {
		return new MiniCooper();
	}

}
