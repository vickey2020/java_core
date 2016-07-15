package com.test.Array;

public class MergeArray {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int b[]={5,6,7,8};
		int len1=a.length+b.length;
		int marge[]= new int[len1];

		for (int i = 0; i < a.length; i++) {

			marge[i]=a[i];

		}
		for(int j=0;j<b.length;j++)
		{
			marge[j+a.length]=b[j];
		}
		System.out.println("marge array is");
		for(int k=0;k<=marge.length-1;k++)
		{
			System.out.print( marge[k]);
		}
	}

}
