package com.test.Array;

public class FreqNoo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,1,2,1,3,5,5,777,2,8,99,5,9,9,9,9,9};
		int count=0,i,j;
		for(i=0;i<a.length;i++)
		{
			count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					
					a[j]='\0';
					++count;
				}
			}
			if(a[i]!=0 && count%2==1)
			{
				System.out.println(a[i]+" "+count);
			}
		}
	}
}
