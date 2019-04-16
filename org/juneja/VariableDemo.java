package org.juneja;

public class VariableDemo {
		
	String name = "JAVA";
	int a = 100;
	
	static String schoolName = "IIT";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo vd = new VariableDemo();
		VariableDemo vd2 = new VariableDemo();
		vd.displayVariables();
			
		//System.out.println( i+j);

	}
	
	public void displayVariables(){
		// local variables
		// Variables inside the brackets are called local variables
		
		int i = 100;
		int j = 200;
		int sum = 0;
		System.out.println( "Sum of : " + (i+j));
		
		System.out.println("Global/ Instance variables vals are : " + name + "  " + (a));
		
		System.out.println("School Name : " + schoolName);
		
		schoolName = "BigData University";
		
		System.out.println("School Name : " + schoolName); 
		
	}
}
