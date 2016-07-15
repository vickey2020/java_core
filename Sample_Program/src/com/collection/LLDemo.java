package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add("abc");
		l.add(10);
		l.add(null);
		System.out.println(l);
		l.add(1, "Nav");
		System.out.println(l);
		ArrayList al=new ArrayList<>();
		al.add("abc");
		al.add(10);
		al.add(null);
		System.out.println(al);
		al.add(1, "ncnc");
		System.out.println(al);
		
	}

}
