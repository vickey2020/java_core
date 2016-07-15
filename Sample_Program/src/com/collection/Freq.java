package com.collection;

import java.util.Scanner;

public class Freq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString=sc.next();
		freq(inputString);
	}
	public static void freq(String inputString)
	{
		int count;
		char[] ch=new char[inputString.length()];
		ch=inputString.toCharArray();
		
		for(int i=0;i<inputString.length();i++)
		{
			count=0;
			
			for(int j=0;j<inputString.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					
				}
			}
			if(count!=0)
			{
					System.out.println(ch[i]+" "+count);
			}
			
		}
		
	}

}
