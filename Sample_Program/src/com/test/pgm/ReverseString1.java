package com.test.pgm;

public class ReverseString1 {
	public static void main(String[] args) {
		String s=" Hello world !!";
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
