package com.package1;

import java.util.ArrayList;
import java.util.Iterator;

public class H {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("nav");
	list.add("neet");
	list.add("abc");
	for(String str:list)
	{
		System.out.println(str);
	}
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		String str=itr.next();
		System.out.println(str);
	}
}
}
class H1
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}