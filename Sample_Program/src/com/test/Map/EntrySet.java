package com.test.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.test.pgm.Str;


public class EntrySet {
	public static void main(String[] args) {
		LinkedHashMap map =new LinkedHashMap();
		map.put("Nav", 101);
		map.put("Neet", 102);
		map.put("Done", 777);
		map.put("Love", 103);
		map.put("you", 104);
		map.put("Neet",999);
		map.put("Love", 888);
		System.out.println("Map data "+map);
		map.put("Dare", 105);
		//System.out.println(map.put("abc", 900));
		Set key=map.keySet();
		Set entry=map.entrySet();
		Collection value=map.values();
		System.out.println("Key "+key);
		System.out.println("Entry "+entry);
		System.out.println("Value "+value);
		
		Iterator itr=entry.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());
			if(m1.getKey().equals("Neet"))
			{
				m1.setValue(999);
			}
			
		}
		
		System.out.println(map);
	}
}