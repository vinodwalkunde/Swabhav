package com.techlabs.man;

public class Boy implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Boy Cring");
	}

	@Override
	public void laugh() {
		System.out.println("Boy Laugh");
	}

	@Override
	public void wish() {
		System.out.println("Boy Wish");
	}

	@Override
	public void depart() {
		System.out.println("Boy Depart");
	}

}
