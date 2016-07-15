package com.test.string;

public class Revrese_String {
	public static void main(String[] args) {
		String str="Helloo Howare are";
		String words[]=str.split(" ");
		String reverseString=" ";
		System.out.println("String : "+str);
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString + reverseWord+" ";
			
			
		}
		System.out.println("Reverse String : "+reverseString);
		
			
		
	}

}
