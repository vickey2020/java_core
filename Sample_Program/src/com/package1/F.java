package com.package1;

class F1
{
	void  m1(int i)
	{
		System.out.println(15);
		
	}
}
class F2 extends F1
{
	void  m1(int i)
	{
		System.out.println(77);
		
	}
}

public class F {
	public static void main(String[] args) {
		F1 a=new F2();
		a.m1(10);
		
		
	}

}
