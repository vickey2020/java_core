package com.test.randomPgm;

public class PrimeNo {
	public static void main(String[] args) {
		int i,j;
		System.out.println("Prime Number is :");
		for(i=1;i<=30;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					break;
				}
				else
				{
					if(i%j==1 && i/j==1 )
					{
						System.out.print(i+" ");
					}

				}
			}
			
					
		}
		
		
	}

}
