package com.test.pgm;

class Test
{
	private static Test t;
	static int i=1;
	private Test(){	}
	public static Test getInstance()
	{
		if(t==null)
		{
			t=new Test();
			System.out.println(i);
		}
		return t;
	}
	public Object clone()
	{
		return this;
	}
	
	}
	
public class Singelton {
	public static void main(String[] args) {
		Test t1=Test.getInstance();
		Test t2=Test.getInstance();
		
	
}
}
