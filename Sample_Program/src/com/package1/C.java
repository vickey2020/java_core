package com.package1;

public class C {
	static int count=0;
	
	{
		count++;
	}
	
	{
		System.out.println("Hello");;
	}
	public static void main(String[] args) {
		C c=new C();
		int i=0;
		int[] b={11,22,33,44,55};
		System.out.println(b[i=i++]);
		//System.out.println(args.length);
		//C c1=new C(10);
		//System.out.println(count);
	}

}
