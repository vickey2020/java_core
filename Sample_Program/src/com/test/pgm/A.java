package com.test.pgm;

final class P
{
	public void m1(){System.out.println("m1111");}
	static int l=10; 
	public final void m2()
	{
		System.out.println("m222");
	}
}
public class A {
	public static void main(String[] args) {
	System.out.println(P.l);
	}
	public void m1()
	{
		System.out.println("adadsad");
	}
	public void m2()
	{
		System.out.println("fsfsf");
	}

}
