package com.techlabs.test.man;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotionable;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class TestManBoy {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		atTheMovie(boy);

		atTheParty(man);
		atTheParty(boy);
	}

	public static void atTheMovie(IEmotionable emotionable) {
		System.out.println("At the Movie");
		emotionable.cry();
		emotionable.laugh();
	}

	public static void atTheParty(IMannerable mannerable) {
		System.out.println("At The Party");
		mannerable.depart();
		mannerable.wish();
	}

}
