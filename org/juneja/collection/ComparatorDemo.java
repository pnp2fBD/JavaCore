package org;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	double sal;
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}


class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.id == emp2.id){
			return 0;
		}else if (emp1.id > emp2.id){
			return 1;
		}else
			return -1;
	}
}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
			return emp1.name.compareTo(emp2.name);
		}
}

class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.sal == emp2.sal){
			return 0;
		}else if (emp1.sal > emp2.sal){
			return 1;
		}else
			return -1;
		}
}


public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee one   = new Employee(101, "VIRAT", 1000);
		Employee two   = new Employee(102, "ROHIT", 1005);
		Employee three = new Employee(103, "SHIKHAR", 1010);
		Employee four  = new Employee(104, "YUVRAJ", 1020);
		Employee five  = new Employee(105, "HARDIK", 1050);
		
		IdComparator idComp = new IdComparator();
		
		NameComparator NameComp = new NameComparator();
		
		SalComparator SalComp = new SalComparator();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(one);
		empList.add(two);
		empList.add(three);
		empList.add(five);
		empList.add(four);
		
		System.out.println("Before Sort of ID :" + empList);
		
		Collections.sort(empList,idComp);
		
		System.out.println("After Sort of ID :" + empList);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Before Sort of NAme :" + empList);
		
		Collections.sort(empList,NameComp);
		
		System.out.println("After Sort of Name :" + empList);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Before Sort of Salary :" + empList);
		
		Collections.sort(empList,SalComp);
		
		System.out.println("After Sort of Salary :" + empList);
		
		
		
		
		

	}

}
