package com.techlabs.enums;

public enum Builder {
	FENDER, MARTIN, GIBSON;

	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		default:
			break;
		}
		return null;

	}
}
