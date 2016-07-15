package com.test.pgm;

public class Str {
	public static void main(String[] args) {
		String str="navneet gaur";
		int j=10;
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+ " ");
		}
		
		str=str.valueOf(j);
		System.out.println(Integer.parseInt(str)+10);
		
	}

}
