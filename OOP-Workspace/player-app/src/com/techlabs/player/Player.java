package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private GenderOption gender;

	public Player(String name, int age, GenderOption gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Player(String name) {
		this(name, 18, GenderOption.MALE);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderOption getGender() {
		return gender;
	}
	
	public Player whoIsElder(Player player) {
		if(this.age>player.age) {
			return this;
		}
			return player;
		
	}

}
