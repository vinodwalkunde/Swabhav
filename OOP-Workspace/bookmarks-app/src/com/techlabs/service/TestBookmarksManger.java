package com.techlabs.service;

import java.io.IOException;

public class TestBookmarksManger {

	public static void main(String[] args) throws Exception {
		BookmarksManger.addBookmarks("Facebook", "www.facebook.com");
		BookmarksManger.addBookmarks("Youtube", "www.youtube.com");
		BookmarksManger.viewBookmarks();
	}

}
