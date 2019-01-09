package com.techlabs.basic;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int[] number=new int[10];
		
		number[0]=1;
		number[1]=2;
		number[2]=3;
		
		System.out.println(Arrays.toString(number));
		number[3]=50;
		
		
		for(int element:number){
			System.out.println(element);
				
		}
		
		int del,i,size,count=0;
		size=number.length;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Element to be Delete : ");
	       del = scan.nextInt();
	       for(i=0; i<size; i++)
	       {
	           if(number[i] == del)
	           {
	               for(int j=i; j<(size-1); j++)
	               {
	                   number[j] = number[j+1];
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
	               System.out.print(number[i]+ " ");
	           }
	       }
		
	}

}
