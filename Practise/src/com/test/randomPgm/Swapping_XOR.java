package com.test.randomPgm;

public class Swapping_XOR {
	public static void main(String[] args) {
		int a=6,b=4;
		System.out.println("A = "+a+" B="+b);
		a=a^b;
		b=a^b;
		System.out.println("A = "+a+" B="+b);
		a=a^b;
		System.out.println("A = "+a+" B="+b);
		
	}

}
