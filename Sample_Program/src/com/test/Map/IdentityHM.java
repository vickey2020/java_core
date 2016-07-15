package com.test.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHM {
	public static void main(String[] args) {
		IdentityHashMap map=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		map.put(12, i1);
		map.put(13, i2);
		System.out.println(map);
	}

}
