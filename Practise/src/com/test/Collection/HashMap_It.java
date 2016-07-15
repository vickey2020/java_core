package com.test.Collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_It {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Nav", 101);
		map.put("Neet", 105);
		map.put("Vivek", 199);
		map.put("Sharma", 144);
		
		Set<java.util.Map.Entry<String, Integer>> entry=map.entrySet();
		Iterator it =entry.iterator();
		while(it.hasNext())
		{

		    Map.Entry entry1 = (Map.Entry) it.next();
		    System.out.println("Key = " + entry1.getKey() + ", Value = " + entry1.getValue());
		}
	}

}
