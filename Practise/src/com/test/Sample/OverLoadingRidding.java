package com.test.Sample;

class OL1
{
	public static void add()
	{
		System.out.println("Add() Parent");
	}
	public void mul()
	{
		System.out.println("Mul() Parent");
	}

}
class OL2 extends OL1
{
	public static void add()
	{
		System.out.println("Add() Child");
	}
	public void mul()
	{
		System.out.println("Mul() Child");
	}

	
}



public class OverLoadingRidding {
	public static void main(String[] args) {
		OL1 l1=new OL1();
		OL2 l2=new OL2();
		OL1 l3=new OL2();
		l3.add();
		System.out.println();
	}

}
