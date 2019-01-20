package com.techlabs.presentation;

import java.util.Scanner;

import com.techlabs.service.BookmarksManger;

public class BookmarksUI {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name :");
		String name = sc.nextLine();
		System.out.println("Enter URL :");
		String url = sc.nextLine();

		BookmarksManger.addBookmarks(name, url);
		
		System.out.println("Bookmarks Contains");
		BookmarksManger.viewBookmarks();
		sc.close();
	}

}
