package com.collection;

import java.util.Arrays;

public class A{
	public static void main(String[] args) {
		Ma[] x={
				new Ma(10),
				new Ma(5),
				new Ma(15),
				new Ma(16),
				new Ma(12)
				};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}


class Ma implements Comparable
{
	int i;
	Ma(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i ="+i;
	}
	public int compareTo(Object o)
	{
		Ma m=(Ma)o;
		return i-m.i;
	}
}