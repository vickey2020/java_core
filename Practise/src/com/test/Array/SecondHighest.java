package com.test.Array;

import java.util.Arrays;

public class SecondHighest {
	public static void main(String[] args) {
		int[] a={2,17,6,11,10,19,18,56,88,44,109};
		int largest=a[0];
		int secondLargest=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest=a[i];
				
			}
			else if(largest>a[i]&& a[i]>secondLargest)
			{
				secondLargest=a[i];
			}
			
		}
		System.out.println("Largest "+largest+" Second Largest "+secondLargest);
	}



}
