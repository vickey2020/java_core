package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class J {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(45);
		list.add(24);
		list.add(19);
		list.add(30);
		HashMap map=new HashMap<>();
		map.put("navneet", 101);
		map.put("jakhar", 190);
		map.put("koushik", 120);
		map.put("daman", 187);
		Collections.sort(list);
		System.out.println(list+" "+map);
		for(int i:list)
		{
			System.out.println(i);
		}
	}

}
class J1
{
	int i;
	String str;
	J1(int i,String str)
	{
		this.i=i;
		this.str=str;
	}
	public String toString()
	{
		return "i= "+i+"String ="+str;
	}
}
