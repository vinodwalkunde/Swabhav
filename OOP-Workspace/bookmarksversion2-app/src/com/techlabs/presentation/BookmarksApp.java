package com.techlabs.presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.techlabs.service.BookmarksManger;
import com.techlabs.service.IBookMarks;

public class BookmarksApp {
	private static final int ADD = 1, VIEW = 2, EXIT = 3;

	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		IBookMarks bookmarksManger=new BookmarksManger();

		do {
			System.out.println("Enter Choice");
			System.out.println("1.Add Bookmarks");
			System.out.println("2.view Bookmarks");
			System.out.println("3.exit");
			choice = scanner.nextInt();
			switch (choice) {
			case ADD:
				System.out.println("Enter Name :");
				String name = scanner.next();
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter URL :");
				String url = scanner1.next();
				
				bookmarksManger.addBookmarks(name, url);
				break;

			case VIEW:
				bookmarksManger.viewBookmarks();
				break;

			case EXIT:
				break;

			default:
				System.out.println("You Enter Wrong Choice");
			}
		} while (choice != 3);

		scanner.close();

	}

}
