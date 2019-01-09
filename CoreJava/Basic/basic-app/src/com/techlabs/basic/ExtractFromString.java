package com.techlabs.basic;

import java.util.Scanner;

public class ExtractFromString {

	public static void main(String[] args) {
		String url = "http://swabhavtechlabs.com/devloper=Ajay&Client=AurionPro";
        
        Scanner instr = new Scanner(url);
        instr.useDelimiter("http://|.com/|&");
        
        while(instr.hasNext())
        {
            System.out.println(instr.next());
        }
        instr.close();
    }

}
