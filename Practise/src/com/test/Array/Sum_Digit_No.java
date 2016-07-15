package com.test.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Sum_Digit_No {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(findElement(a, target)));
	}
	
	public static int[] findElement(int[] a, int target) {
		int[] a1=new int[3];
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		int diff;
		for(int i=0;i<a.length;i++)
		{
			diff=target-(a[i]+a[i+1]);
			if(map.containsKey(diff))
			{
				a1[0] = i;
				a1[1]=i+1;
				a1[2] = map.get(diff);
				return a1;
			}
			else
			{
				map.put(a[i], i);
			}
			
		}
		throw new RuntimeException("Not found");	
	}

}
