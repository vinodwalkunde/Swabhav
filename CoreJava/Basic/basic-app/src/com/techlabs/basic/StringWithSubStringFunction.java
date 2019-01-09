package com.techlabs.basic;

public class StringWithSubStringFunction {

	public static void main(String[] args) {
		//String url = "http://www.Google.com?devloper=Jack&Client=Tcs";
		
		if(args.length!=0) {
			for(String names: args) {
				System.out.println(names.substring(11,17));
				System.out.println(names.substring(22, 35));
				System.out.println(names.substring(36));
			}
		}else {
			System.out.println("Please Enter Url");
		}
		
	}

}
