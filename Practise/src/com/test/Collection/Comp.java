package com.test.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class SortEmp
{
	private Integer id;
	private String name;
	private String dept;
	private String add;
	
	
	
	public SortEmp(Integer id, String name, String dept, String add) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.add = add;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		add = add;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+dept+"\t"+add;
	}

}

class MyC implements Comparator<SortEmp>
{

	@Override
	public int compare(SortEmp o1, SortEmp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class Comp {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new SortEmp(101,"Navneet","Madiwala","HR"));
		list.add(new SortEmp(109,"Vivek","SilkBoard","Technical"));
		list.add(new SortEmp(107, "DeenDayal", "HSR", "Devlopment"));
		list.add(new SortEmp(105, "Uday", "RopenaAgarhar", "Technical"));
		System.out.println("Before Sorting ");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(" After Sorting ");
		Collections.sort(list,new MyC());
		for(Object e:list)
		{
			System.out.println(e);
		}
		
	}

}









