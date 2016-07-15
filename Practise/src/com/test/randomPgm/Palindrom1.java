package com.test.randomPgm;

import java.util.Scanner;

public class Palindrom1 {
	public static void main(String[] args) {
	boolean flag=false;
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println(str);
	char[] ch=new char[str.length()];
	ch=str.toCharArray();
	for(int i=0,j=str.length()-1;i<str.length();i++,j--)
	{
		if(ch[i]==ch[j])
		{
			flag=true;
			continue;
		}
		else
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not Palindrome");

	}
}
