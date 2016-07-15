package com.collection;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Object, String> hash=new Hashtable<>();
		hash.put(new Temp(10),"A");
		hash.put(new Temp(40), "Faas");
		hash.put(new Temp(55), "ppp");
		System.out.println(hash);
		
	}

}

class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+" ";
	}
}
