package org.juneja.strings;

public class StringLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String course = "JAVA";
		
		String name = "JAVA";
		
		String name2 = new String("JAVA");
			
		
		System.out.println( " HashCode " + course.hashCode());
		
		System.out.println( " HashCode " + name.hashCode());
		
		System.out.println( " HashCode " + name2.hashCode());
		
		//course = course + "J2EE";
		
		System.out.println( " HashCode " + course.hashCode());
		
		System.out.println( " HashCode " + name.hashCode());
		
		if(name.equals(name2)) {
			System.out.println(" Equals");
		}else {
			System.out.println(" Not Equals");
		}
		
		if (name == course){
			System.out.println("both name and Course are referring the same object");
		}
		
		if(name == name2){
			System.out.println("both name and name2 are referring the same object");
		}
		
		System.out.println( "Char at 3 is " + course.charAt(2));
			
		
		course = course.concat("+Hadoop"); // 
		
		System.out.println( "after concat " + course);

		System.out.println( "contains " + course.contains("VA"));
	}

 
}
