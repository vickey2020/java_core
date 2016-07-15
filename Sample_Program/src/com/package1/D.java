package com.package1;

public class D {
public static void main(String[] args) {
	System.out.println(new D());
	test(new int[]{2,4,5,6,7});
}
static void test(int[] x)
{
	System.out.println("Length = "+x.length);
	for(int i:x)
	{
		System.out.println(i);
	}
}
}
