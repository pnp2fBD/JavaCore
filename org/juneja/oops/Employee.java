package org.juneja.oops;

public class Employee {
	
	int Empid;
	String Empname;
	double salary;
	Address empAddress;

	
	public Employee(int empid, String empname, double salary, Address empAddress) {
		super();
		Empid = empid;
		Empname = empname;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	

	@Override
	public String toString() {
		return " [Empid=" + Empid + ", Empname=" + Empname
				+ ", salary=" + salary + ", empAddress=" + empAddress + "]";
	}



	public static void main(String[] args) {
		
		Address myadd  = new Address("H44", 127, "GOLF COURSE ROAD", "Gurugram", "HR", "IND", 132103);
		Employee virat = new Employee(101, "Virat Kohli", 10000, myadd);
		
		System.out.println( "Emplopyee : " + virat);
		

	}

}
