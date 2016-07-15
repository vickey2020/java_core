package com.test.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollectionTest {
	public static void main(String[] args) {
		List<Empp> list = new ArrayList<Empp>();
		 
		list.add(new Empp(1002, "Kausik"));
		list.add(new Empp(1001, "Tridibendu"));
		list.add(new Empp(1003, "Ram"));
		
		System.out.println("\nThe unsorted collection");
		System.out.println("*********************************************************\n");
		for (Empp emp : list)		
			System.out.println(emp);
		
		// Sorting collection in ascending order based on emp id
				Collections.sort(list, new EmpComparator());
				
		// Printing the sorted collection in ascending order based on emp id
				System.out.println("\nThe sorted collection in ascending order based on emp id");
				System.out.println("*********************************************************\n");
				for (Empp emp : list)		
					System.out.println(emp);
		
	}

}

class Empp {
	 
	private Integer empId;
	private String empName;
 
	public Empp(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
 
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
 
	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
 
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
 
	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
 
	@Override
	public String toString() {
 
		return "Emp Id: " + this.getEmpId() + ", Emp Name: "
				+ this.getEmpName();
 
	}
 
}

class EmpComparator implements Comparator<Empp> {
	 
	public int compare(Empp o1, Empp o2) {
 
		// Sorting in ascending order
		return o1.getEmpName().compareTo(o2.getEmpName());
 
		// Sorting in descending order
		// return o2.getEmpId().compareTo(o1.getEmpId());
 
	}
 
}

