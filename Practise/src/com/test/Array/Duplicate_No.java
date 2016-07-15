package com.test.Array;

public class Duplicate_No {
	public static void main(String[] args) {
		int[] a={22,66,99,66,41,66,99,99,22,41,22,51,51};
		int i,j,count;
		for(i=0;i<a.length;i++)
		{
			count=1;
			
			for(j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					++count;
					a[j]='\0';
				}
			}
			if(a[i]!='\0')
			System.out.println(a[i]+" "+count);
		}


	}

}
