package com.techlabs.factoryproblem;

public class AutomobileFactory {
	static AutomobileFactory automobileFactory;

	private AutomobileFactory() {
	}

	public static AutomobileFactory getInstance() {
		if (automobileFactory == null) {
			automobileFactory = new AutomobileFactory();
		}
		return automobileFactory;
	}

	public IAutomobile make(AutoCarType autoCarType) {
		if (autoCarType == AutoCarType.BMW) {
			return new BMW();
		}
		if (autoCarType == AutoCarType.AUDI) {
			return new Audi();
		}
		if (autoCarType == AutoCarType.MINICOOPER) {
			return new MiniCooper();
		}
		return null;

	}
}
