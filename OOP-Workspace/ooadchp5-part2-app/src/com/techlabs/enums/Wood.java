package com.techlabs.enums;

public enum Wood {
	ALDER, BASSWOOD, MAPLE;
	public String toString() {
		switch (this) {
		case ALDER:
			return "Alder";
		case BASSWOOD:
			return "Basswood";
		case MAPLE:
			return "Maple";
		default:
			break;
		}
		return null;
	}
}
