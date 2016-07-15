package com.test.randomPgm;

public class ArarmStrongNumber {

	public static void main(String[] args) {
		//System.out.println("enter the numer");
		int no=153,sum=0, number=0;
		int save=no;
		while(no>0)
		{
			sum=no%10;
			//rev=rev*10+no%10;
			number=number+(sum*sum*sum);
			
			
			no=no/10;
		}
		if(number==save)
		System.out.println("armstrong number");
		else
			System.out.println("not armstrong");

		}

	}


