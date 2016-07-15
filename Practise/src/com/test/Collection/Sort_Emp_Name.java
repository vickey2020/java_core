package com.test.Collection;

import java.util.*;

public class Sort_Emp_Name {
	public static void main(String[] args) {
		
	

	Employee e1 = new Employee("sachin");
	Employee e2 = new Employee("anil");
	Employee e3 = new Employee("sagar");
	Employee e4 = new Employee("ganesh");

	/**
	 * Create a list of employees
	 */
	List<Employee> list = new ArrayList<Employee>();

	/**
	 * add employees to the list
	 */
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);

	

	System.out.println("----------------Before Sort----------------");
	/**
	 * get the iterator object from list
	 */
	Iterator iterator = list.iterator();

	while (iterator.hasNext()) {

		/**
		 * get the employee
		 */
		Employee employee = (Employee) iterator.next();

		/**
		 * print the employee name
		 */
		System.out.println(employee.getEmpName());

	}


	/**
	 * Below method sorts the Employee objects, it internally calls equals
	 * method of Employee class to know, how to compare the two objects. In
	 * our example, it compares based on employee name.
	 */
	Collections.sort(list);

	/**
	 * You can even sort an employee object in reverse order
	 * by using below mentioned method.
	 *
	 * Collections.reverse(list);
	 *
	 */

	System.out.println("----------------After Sort----------------");

	/**
	 * get the iterator object from list
	 */
	Iterator iterator2 = list.iterator();

	while (iterator2.hasNext()) {
		/**
		 * get the employee
		 */
		Employee employee = (Employee) iterator2.next();

		/**
		 * print the employee name
		 */
		System.out.println(employee.getEmpName());

	}

}
}









class Employee implements Comparable<Employee>{

	public Employee() {

	}

	public Employee(String empName) {
		this.empName = empName;
	}

	private String empId;
	private String empName;

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * compareTo method is used while sorting an employee
	 */
	public int compareTo(Employee o) {
		/**
		 * we compare two names of the employee to figure out,
		 * two employees are equal or not
		 */
		return this.empName.compareTo(o.getEmpName());
	}
}
