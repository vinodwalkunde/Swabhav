package com.techlabs.factory;

class MiniCooper implements IAutomobile {

	@Override
	public void start() {
		System.out.println("MiniCooper Start");
	}

	@Override
	public void stop() {
		System.out.println("MiniCooper Stop");
	}

}
