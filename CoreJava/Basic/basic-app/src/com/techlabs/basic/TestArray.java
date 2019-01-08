package com.techlabs.basic;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int[] arry=new int[10];
		
		arry[0]=1;
		arry[1]=2;
		arry[2]=3;
		
		System.out.println(Arrays.toString(arry));
		arry[3]=50;
		
		
		for(int element:arry){
			System.out.println(element);
				
		}
		
		int del,i,size,count=0;
		size=arry.length;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Element to be Delete : ");
	       del = scan.nextInt();
	       for(i=0; i<size; i++)
	       {
	           if(arry[i] == del)
	           {
	               for(int j=i; j<(size-1); j++)
	               {
	                   arry[j] = arry[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	           System.out.print("Element Not Found");
	       }
	       else
	       {
	           System.out.println("Element Deleted Successfully");
	           System.out.println("Now the New Array is ");
	           for(i=0; i<(size-1); i++)
	           {
	               System.out.print(arry[i]+ " ");
	           }
	       }
		
	}

}
