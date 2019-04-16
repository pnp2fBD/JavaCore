package org.juneja.exception;

public class WithoutExceptionDemo {
	static String name;
	
	public static void printMisc(){
		printMisc2();
	}
	
	public static void printMisc2(){
		System.out.println("Name length " + name.length());
	}

	public static void main(String[] args) {
		try{
		System.out.println("Main1");
		System.out.println("Main2");
		printMisc();	
		System.out.println("Main4");
		}catch(Exception e){
			
			System.out.println("My Custom Exception is " + e);
			System.out.println("My Custom Exception is " + e.getMessage());
			e.printStackTrace();
			
			
		}
	}

}
