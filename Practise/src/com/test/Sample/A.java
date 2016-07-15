package com.test.Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class A {
	public static void main(String[] args) {
		int i=10,j=20;
		Integer a=i;
		j=a;
		System.out.println(a+" "+j);
		HashSet set=new HashSet();
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("B");
		
		System.out.println(set);
		
		
		// -----------------------------
		String s1=new String();
		String s2=new String();
		String s3="abc";
		System.out.println(s1.hashCode()+"  "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s1.equals(s3));
		
		//------------------------------
		
		HashMap map=new HashMap();
		map.put(11, "xyz");
		map.put(12, "xyz");
		map.put(12, "abc");
		System.out.println("Map : "+map.get(11).hashCode()+" "+map.get(12).hashCode());
		System.out.println(map);
		
		
	}

}
