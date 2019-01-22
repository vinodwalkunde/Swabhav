package com.techlabs.presentation;

import java.util.Scanner;

import com.techlabs.service.BookmarksManger;

public class BookmarksApp {

	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Enter Choice");
			System.out.println("1.Add Bookmarks");
			System.out.println("2.view Bookmarks");
			System.out.println("3.exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name :");
				String name = scanner.nextLine();
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter URL :");
				String url = scanner1.nextLine();
				BookmarksManger.addBookmarks(name, url);
				break;

			case 2:
				BookmarksManger.viewBookmarks();
				break;
			default:
				System.out.println("You Enter Wrong Choice");
			}
		} while (choice != 3);

		System.out.println("Bookmarks Contains");

		scanner.close();

	}

}
