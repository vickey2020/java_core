package com.test.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		String input;
		// Method1
		//System.out.println("Enter String");
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		input=br.readLine();
		System.out.println("Input : "+ input);
		char[] arr=input.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i] + " ");
		}catch(Exception e){}
		
		/*//Method 2
		input="alive is awesome";
		StringBuilder input1=new StringBuilder();
		input1.append(input);
		input1=input1.reverse();
		System.out.println(input1);
		*/
	}

}
