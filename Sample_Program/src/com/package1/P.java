package com.package1;

 class P1 {
	 void m1()
	{
		System.out.println("Hello PPPP");
	}
}

class P extends P1
{
	 void m1()
	{
		System.out.println("hiiii");
	}
	public static void main(String[] args) {
		P p=new P();
		p.m1();
		P1 p1=new P1();
		p1.m1();
		P p2=(P) new P1();
	}
}
