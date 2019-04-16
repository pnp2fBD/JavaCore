package org;

import java.util.HashSet;

public class SetDemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSet ravi = new EmployeeSet(100,"Ravi", 10000);
		EmployeeSet veera = new EmployeeSet(100,"Ravi", 10000);
		EmployeeSet saurabh = new EmployeeSet(101,"saurabh", 11000);
		EmployeeSet Manjula = new EmployeeSet(102,"Manjula", 12000);
		EmployeeSet Saket = new EmployeeSet(103,"Saket", 13000);
		
				
		HashSet<EmployeeSet> emp = new HashSet<EmployeeSet>();
		emp.add(ravi);
		emp.add(veera);
		emp.add(saurabh);
		emp.add(Manjula);
		emp.add(Saket);
		//emp.add(null);
		
		System.out.println("***********");
		System.out.println("Employee HashSet " + emp );
		System.out.println("HashCode : " + ravi);
		System.out.println("HashCode : " + veera);
		System.out.println("HashCode : " + saurabh);
		System.out.println("HashCode : " + Manjula);
		System.out.println("HashCode : " + Saket);
		
		System.out.println(ravi.equals(veera));
//		emp.toString();
//		
		
		
		
		
		
	}

}
