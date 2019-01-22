package com.techlabs.crud;

public interface ICrudable {
	public abstract void create();

	public abstract void read();

	public void update();

	public void delete();
}
