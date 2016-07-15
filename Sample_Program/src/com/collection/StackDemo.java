package com.collection;

import java.util.RandomAccess;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("A");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("99");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("z"));
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println();

	}

}
