package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.event.TreeExpansionEvent;

public class B {
	public static void main(String[] args) {
HashSet set=new HashSet();
set.add("abc");
set.add("xyz");
set.add(null);
set.add("abc");
set.add("10");
set.add(99);
set.add(null);
System.out.println(set);

TreeSet tree=new TreeSet();
tree.add(799);
tree.add(10);
//tree.add("bbb");
System.out.println(tree);

System.out.println("A".compareTo("Z"));
System.out.println("B".compareTo("D"));
System.out.println("C".compareTo("A"));
System.out.println("F".compareTo("F"));

	}

}
