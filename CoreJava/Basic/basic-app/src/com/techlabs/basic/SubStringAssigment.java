package com.techlabs.basic;

import java.util.Arrays;

public class SubStringAssigment {

	public static void main(String[] args) {
		String url = "http://www.Google.com?devloper=Jack&Client=Tcs";
		String[] newStringArray = url.split("\\.");

		System.out.println("Domain:" +newStringArray[1]);
		String tempString = newStringArray[2];

		String[] stringArray2 = tempString.split("\\?");
		String tempString2 = stringArray2[1];

		String[] stringArray3 = tempString2.split("&");
		
		System.out.println(stringArray3[0]);
		System.out.println(stringArray3[1]);

	}

}
