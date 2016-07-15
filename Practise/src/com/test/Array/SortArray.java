package com.test.Array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a={2,17,6,11,10,19,18,56,88,44,109};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int j:a)
		{
			System.out.print(j+" ");
		}
	}
	

}
