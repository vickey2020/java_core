package com.test.Map;

import java.util.Hashtable;

public class HashTableDemo {
public static void main(String[] args) {
	Hashtable ht=new Hashtable();
	ht.put(new Tempp(7), "A");
	ht.put(new Tempp(8), "b");
	ht.put(new Tempp(88), "c");
	ht.put(new Tempp(66), "d");
	ht.put(new Tempp(45), "e");
	ht.put(new Tempp(97), "f");
	ht.put("Durga", null);
	System.out.println(ht);
}
}
class Tempp
{
	int i;
	Tempp(int i)
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