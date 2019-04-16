package org.juneja.strings;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(100);
		int a = i.intValue();
		
		System.out.println("Integer value of A " + a);
		System.out.println("Value of i " + i);
		
		int b = 1234;
		
		Integer objint = new Integer(b);
		
		System.out.println( "Object value of objint : " + objint);
		
		String s1 = new String("JAVA");
		
		System.out.println(" Value of s1 " + s1);

	}

}
