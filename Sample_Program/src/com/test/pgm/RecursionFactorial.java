package com.test.pgm;

public class RecursionFactorial {
	public static void main(String[] args) {
		System.out.println(fact(5));
		//System.out.println("Result "+result);
		
	}
	static int fact(int i)
	{
		if(i==0)
			return 1;
		else
		return fact(i-1)*i;
		
	}

}
