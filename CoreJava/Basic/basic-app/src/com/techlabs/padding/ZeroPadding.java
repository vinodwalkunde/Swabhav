package com.techlabs.padding;

public class ZeroPadding {

	public static void main(String[] args) {
	 String output = createZeroPaddedString("1234567890", 20);
	 System.out.println("OutPut with Zero Padded ="+output);
	 
	 String removeZero = removeZeroFromZeroPaddedString(output);
	 System.out.println("OutPut After Remove Zero ="+removeZero);
	 
	}
	public static String createZeroPaddedString(String originalString,int length) {
		  String paddedString = originalString;
	      while (paddedString.length() < length) {
	         paddedString = "0" + paddedString;
	      }
	      return paddedString;
	}
	public static String removeZeroFromZeroPaddedString(String zeroPaddedString) {
		
		return zeroPaddedString.replaceFirst("^0+(?!$)", "");
		
	}

}

