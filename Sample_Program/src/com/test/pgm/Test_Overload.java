package com.test.pgm;

public class Test_Overload {
public void m1(Object obj)
{
	System.out.println("obj version");
}
public void m1(String str)
{
	
System.out.println("String version");
}
	public static void main(String[] args) {
		Test_Overload t=new Test_Overload();
		t.m1(new Object());
		t.m1("String");
		t.m1(null);
}
}
