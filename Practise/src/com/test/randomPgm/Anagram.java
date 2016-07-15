package com.test.randomPgm;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="abwcd hope vivek";
		String str2="dcbaw epho  vi ve k";
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		int ch;
		boolean flag=false;
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();

		for(int i=0;i<str1.length();i++)
		{
		
			if(ch1.length!=ch2.length)
				break;
			else
			{
				Arrays.sort(ch1);
				System.out.println("Ch1 :"+ch1.length);
				Arrays.sort(ch2);
				System.out.println(ch2);
				flag=Arrays.equals(ch1, ch2);
			}
		}
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");


	}

	 /*@Override
	  public String toString() {
		 
	    return "";
	  }
*/

}
