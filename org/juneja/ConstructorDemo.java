package org.juneja;

class StudentC{
	int id;
	String name;
	String dob;
	
	public StudentC(){  // Default Constructors
		id=99;
		name="Java";
		dob="01-01-1900";
	}
	
	public StudentC(int id, String name, String dob) { // Parameter Constructors
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
			
	public void printData(){
		System.out.println ( "ID is :" + id );
		System.out.println ( "Name is :" + name );
		System.out.println ( "DOB is :" + dob );
	}	
}


public class ConstructorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentC def = new StudentC();
		StudentC s1 = new StudentC(100,"Virat","01-01-1985");
		StudentC s2 = new StudentC(101, "Yuvraj", "01-01-1982");
		StudentC s3 = new StudentC(102, "MSD", "01-01-1983");
		StudentC s4 = new StudentC(103, "Rohit", "01-01-1987");
		def.printData();
		s1.printData();
		s2.printData();
		s3.printData();
		s4.printData();
	}

}
