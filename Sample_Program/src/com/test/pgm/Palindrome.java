package com.test.pgm;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String inputString=sc.nextLine();
		palindromeCheck(inputString);
	}
	/*public String toString() {
		return "s";
	}*/

	public static void palindromeCheck(String str)
	{
		char[] ch=new char[str.length()];
		ch=str.toCharArray();
		int flag=1;
		String s="";
		
		for(int j=str.length()-1,i=0;j>=0;j--,i++)
		{
			if(ch[i]==ch[j])
			{
				flag=1;
				continue ;
			}
			else
				flag=0;
		}
		
		if(flag==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
			
	}
	
	
	
	
	
}
