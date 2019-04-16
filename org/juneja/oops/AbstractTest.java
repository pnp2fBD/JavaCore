package org.juneja.oops;

public abstract class AbstractTest {
	
	//Instance variable
	int id;
	String name;
	
	//static Variable
	static String schoolname; 
	
	//Constructor
	public AbstractTest(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("From Constructor Method in Abstract Class");
	}

	// Non Abstract method
	public void disp(){
	System.out.println("ID : " + id);
	System.out.println("NAme : " + name);
	print2();
	}
	
	private void print2(){
		System.out.println("Private ID : " + id);
		System.out.println("Private Name : " + name);		
		}
	
	//Abstract Methods
	public abstract void add();
	public abstract void sub();
	public abstract void mult();
	public abstract void div();

	//Blocks
	{
		System.out.println("I am from Instance Initailaization Block");
	}
	
	//Static Blocks
	static {
		schoolname = "BIGDATA UNIVERSITY";
		System.out.println("Static SchoolName : " + schoolname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" From Main Method");
		

		

	}

}
