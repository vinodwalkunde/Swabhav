package com.techlabs.businesslogic;

public class TestBookmarks {
	public static void main(String[] args) {
		Bookmarks bookmarks=new Bookmarks("GOOGLE","www.google.com");
		System.out.println(bookmarks.getName());
		System.out.println(bookmarks.getUrl());
	}
}
