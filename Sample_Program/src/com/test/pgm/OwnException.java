package com.test.pgm;

public class OwnException {
	public static void main(String[] args)  {
		try{
		throw new MyException1("Exception Status");
		}catch(MyException1 e){  };

	}
}

class MyException1 extends Exception
{
	
	public MyException1(String msg)
	{
		super();
		System.out.println(msg);
	}
}