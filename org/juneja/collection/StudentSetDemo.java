package org;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student one = new Student(110,"Hemant",100);
		Student two = new Student(111,"Bindu",101);
		Student three = new Student(112,"Virat",102);
		Student four = new Student(113,"Rohit",103);
		Student five = new Student(110,"Hemant",100);
		
		HashSet<Student> hset = new HashSet<Student>();
		hset.add(one);
		hset.add(two);
		hset.add(three);
		hset.add(four);
		hset.add(five);
		
		//Collections.sort((Set<String>) hset);
		
		System.out.println(" HashSet of Students " + hset);
		
		TreeSet<Student> tset = new TreeSet<Student>();
		
		tset.addAll(hset);
		
		System.out.println(" TreeSet of Students " + tset);
		
		
		
		
		
	}

}
