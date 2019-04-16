package org;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set1.add("z");
		set1.add("w");
		set1.add("a");
		set1.add(null);
		
		
		Iterator itr = set1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("+++++++++++++++++++");
		
		for(String s:set1){
			System.out.println("Set1 Elements : " + s);
		}
		
		System.out.println("+++++++++++++++++++");
		
		System.out.println("Print All HashSet Elements " + set1);
		
		EmployeeSet ravi = new EmployeeSet(101, "Ravi", 1000.00);
		EmployeeSet veera = new EmployeeSet(102, "Veera", 1001.00);
		EmployeeSet Sam = new EmployeeSet(103, "Sam", 1005.00);
		EmployeeSet Manju = new EmployeeSet(104, "Manju", 1010.00);
		EmployeeSet Virat = new EmployeeSet(101, "Ravi", 1000.00);
		
		HashSet<EmployeeSet> emp2 = new HashSet<EmployeeSet>();
		
		emp2.add(ravi);
		emp2.add(veera);
		emp2.add(Manju);
		emp2.add(Sam);
		emp2.add(Virat);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Collections.sort(emp2);
		//Set is unordered collection and 
		
		for(EmployeeSet h:emp2){
			System.out.println("HashSet " + h);			
		}
		
		System.out.println(" Employee HashSet : " + emp2);
						
	}

}
