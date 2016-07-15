package com.test.randomPgm;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter No");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		fact(no);
	}
	static void fact(int no)
	{
		int fact=1;
		if(no==0 && no==1)
			System.out.println("1");
		else
			while(no!=0)
			{
				fact=fact*no;
				no--;
			}
		System.out.println("Number is "+fact);


	}
}
