package com.package1;

public class I {
	int m1(int i)
	{
		try
		{
		return i/2;
		}catch(Exception e)
		{
			return i/4;
		}
	}
	public static void main(String[] args) {
		I i=new I();
		System.out.println(i.m1(10));
	}

}
