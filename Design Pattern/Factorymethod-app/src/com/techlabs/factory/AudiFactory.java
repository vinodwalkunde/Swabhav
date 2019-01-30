package com.techlabs.factory;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory audifactory;

	private AudiFactory() {
	}

	public static AudiFactory getInstance() {
		if (audifactory == null) {
			audifactory = new AudiFactory();
		}
		return audifactory;
	}

	@Override
	public IAutomobile make() {
		return new Audi();
	}

}
