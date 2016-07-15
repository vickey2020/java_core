package com.test.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequ {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
	Count_Frequency(str);
	}
	
	public static void Count_Frequency(String str)
	{
		char ch[]=new char[str.length()];
		int count;
		ch=str.toCharArray();
		System.out.println();
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				//ch=str.charAt(j);
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(ch[i]+" : "+count);
			}
		}
	}

}
