package com.package1;
class M1
{
	public void print1()
	{
		System.out.println("M1");
	}

}
class M2 extends M1
{
	public void print1()
	{
		System.out.println("M2");
	}
}

class M3 extends M2
{
	public void print1()
	{
		System.out.println("M3");
	}
}


public class M {
	public static void main(String[] args) {
		M1 m1=new M1();
		M2 m2=new M2();
		M3 m3=new M3();
		M m=new M();
		M1 m11=new M2();
		M2 m22=(M2)new M1();
		m11.print1();
		
		/*m22=m3;
		m11=m3;
		m3=(M3)m1;
		m2=(M2)m1;
		m3.print1();
		m2.print1();
		m1.print1();*/
		
		
	}

}
