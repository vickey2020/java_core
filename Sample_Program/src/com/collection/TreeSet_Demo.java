package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String[] args) {
	TreeSet tree=new TreeSet(new MyComparator());
	tree.add(10);
	tree.add(45);
	tree.add(20);
	tree.add(0);
	tree.add(17);
	tree.add(35);
System.out.println(tree);
	
	}
}
class MyComparator implements Comparator
{
	public MyComparator() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	@Override
	public int compare(Object arg0, Object arg1) {
	Integer i1=(Integer) arg0;
	Integer i2=(Integer) arg1;
		return ((i1<i2)?+1:(i1>i2?-1:0));
	}
	
	
}
