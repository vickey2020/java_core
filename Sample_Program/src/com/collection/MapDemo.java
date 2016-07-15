package com.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101, "Nav");
		map.put(102, "neet");
		map.put(105, "Sharmaji");
		map.put(103, "Vivek");
		Set<Entry<Integer, String>> set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m1=(Entry<Integer, String>) itr.next();
			System.out.println(m1.getKey()+"    "+m1.getValue());
			
		}
		HashMap<String, Integer> map1=new HashMap<>();
		map1.put("Ballu", 101);
		map1.put("Rajan", 178);
		map1.put("Abhay", 76);
		map1.put("Sharmaji", 98);
		
		TreeMap t=new TreeMap<>(map1);
		System.out.println("tree "+t);
		System.out.println(map);
	}

}
