package com.collection;

import java.util.*;
import java.util.ArrayList;

public class Emp {
	public static void main(String[] args) {
		List<Emp_Detail> list=new ArrayList<Emp_Detail>();
		list.add(new Emp_Detail(101, "Navneet", 50000));
		list.add(new Emp_Detail(104, "Sagar", 10000));
		list.add(new Emp_Detail(109, "Farah", 9808));
		list.add(new Emp_Detail(107, "Dev", 7777));
		Iterator<Emp_Detail> itr=list.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		for(Emp_Detail str:list)
		{
			System.out.println("Str --> "+str);
		}
		
		System.out.println("After Sorting ");
		
	}
	
}
class Emp_Detail
{
	  private int empId;
	    private String empName;
	    private int empSal;
	     
	    public Emp_Detail(int id, String name, int sal){
	        this.empId = id;
	        this.empName = name;
	        this.empSal = sal;
	    }

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public int getEmpSal() {
			return empSal;
		}

		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}

		@Override
		public String toString() {
			return "empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + " ";
		}
	     
	
  
}
