package com.techlabs.repository;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numString;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder) {
			return false;
		}
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) {
			return false;
		}
		if (type != otherSpec.type) {
			return false;
		}
		if (backWood != otherSpec.backWood) {
			return false;
		}
		if (topWood != otherSpec.topWood) {
			return false;
		}
		if (numString != otherSpec.numString) {
			return false;
		}
		return true;

	}

	public int getNumString() {
		return numString;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}
