package com.test.randomPgm;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		char[] ch=new char[str.length()];
		ch=str.toCharArray();
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
		       str2= str2 + str.charAt(i);
			
		}
		
		boolean b=str2.equals(str);
		
        if(b)
        {
        	System.out.println("String  is palindrom");
        }
        else
        	System.out.println("Not Palindrom");
        
		
	}

}
