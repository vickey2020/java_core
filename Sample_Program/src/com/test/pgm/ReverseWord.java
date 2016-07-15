package com.test.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputString=br.readLine();
		reverseWord(inputString);
		
	}
public static void reverseWord(String inputString)
{
	String reverseString="";
	String[] words=inputString.split(" ");
	
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String reverseWord="";
		for(int j=word.length()-1;j>=0;j--)
		{
			reverseWord=reverseWord+word.charAt(j);
		}
		reverseString=reverseString+reverseWord+" ";
	}
	System.out.println("Input String "+inputString);
	System.out.println("Reverse String "+reverseString);
}
}