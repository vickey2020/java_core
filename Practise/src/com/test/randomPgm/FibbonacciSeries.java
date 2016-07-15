package com.test.randomPgm;

public class FibbonacciSeries {
public static void main(String[] args) {
	fibb(20);
	
	
}
static void fibb(int no)
{
	 int f1=0, f2=1, fab=0;
	 while(fab<=20)
	 {
	 fab=f1+f2;
	 f1=f2;
	 f2=fab;
	 System.out.print(fab+" ");
	 }
	
	
	
}
}

