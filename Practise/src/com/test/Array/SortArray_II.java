package com.test.Array;

import java.util.Scanner;

public class SortArray_II {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sort");
		for(int j:a)
		{
			System.out.print(j+"  ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Sort");
		for(int j:a)
		{
			System.out.print(j+"  ");
		}
		
	}

}
