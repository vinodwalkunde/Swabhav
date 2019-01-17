package com.techlabs.test.player;

import com.techlabs.player.GenderOption;
import com.techlabs.player.Player;

public class TestPlayer {

	public static void main(String[] args) {
		Player p1 = new Player("Sachin", 40, GenderOption.MALE);
		Player p2 = new Player("Virat");

		printDetails(p1);
		printDetails(p2);
		Player elder = p1.whoIsElder(p2);
		printDetails(elder);
	}

	public static void printDetails(Player player) {
		System.out
				.println("Name : " + player.getName() + " Age : " + player.getAge() + " Gender : " + player.getGender());
	}

}
