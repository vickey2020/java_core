package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHM {
	public static void main(String[] args) {
		HashMap<Object, String> imap=new HashMap<>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i3=new Integer(10);
		imap.put(i1, "PAwan");
		imap.put(i2, "Kalyan");
		imap.put(i3, "Babu");
		System.out.println(imap);
		
	}

}
