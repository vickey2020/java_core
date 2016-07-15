package com.test.randomPgm;

public class sum {

	public static void main(String[] args) {
	System.out.println("enter the numer");
	int no=145,sum=0,rev=0;
	while(no!=0)
	{
		sum=sum+no%10;
		rev=rev*10+no%10;
		
		no=no/10;
	}
	System.out.println(sum);
	System.out.println(rev);

	}

}
