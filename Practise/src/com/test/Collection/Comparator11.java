package com.test.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

class Emp 
{
	private int id;
	private String name;
	private String add;
	private String dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	Emp()
	{
		
	}
	
	Emp(int id,String name,String add,String dept)
	{
		this.id=id;
		this.name=name;
		this.add=add;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+"\t"+add+"\t"+dept;
	}
}

class MyComp implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2)
	{
		return o1.getId()-o2.getId();
	}
}


public class Comparator11 {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new Emp(101,"Navneet","Madiwala","HR"));
		list.add(new Emp(109,"Vivek","SilkBoard","Technical"));
		list.add(new Emp(107, "DeenDayal", "HSR", "Devlopment"));
		list.add(new Emp(105, "Uday", "RopenaAgarhar", "Technical"));
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(list,new MyComp());
		
		System.out.println('\n');
		System.out.println("Sorte Employee based on ID");
		for(Object e:list)
		{
			System.out.println(e);
		}
		
	}
	

}
