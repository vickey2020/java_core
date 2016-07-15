package com.package1;

public class N {
	public static void main(String[] arg)  {
		try	{
				throw new ME(10/0);
			}catch(ME e){}
		finally
			{
				System.out.println("finally");
			}
		
	}

}

class ME extends ArithmeticException 
{
	public ME(int nn)
	{
		super();
		System.out.println(nn);
	}
	
}
