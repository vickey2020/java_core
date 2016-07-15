package com.test.randomPgm;

public class Recursion_Factorial {
	public static void main(String[] args) {
		long i=fact(11);
		System.out.println(i);
	}
	
	static long fact(int no)
	{
		long result;
	  if(no==0 || no==1)
	  	  return 1;
	  result=fact(no-1)*no;
		  return result;
	  

		
	}

}
