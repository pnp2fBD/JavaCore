package org.juneja.oops;

public class IIBSIBdemo {
	
	int id;
	String name;
	static String schoolname;
	
	public IIBSIBdemo(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two Args Construtor");
	}

	
	public IIBSIBdemo() {
		System.out.println("No Args Construtor");
	}

	{ //IIB
		System.out.println(" ++ FROM IIB ++");
		if(this.id==0){
			this.id =100;
		}
		if(this.name == null){
			this.name = "HDP";
		}
	}
	
	static{
		System.out.println(" FROM SIB");
		schoolname = "BD UNIVERSITY";
	}

	
	public void print(){
		System.out.println("====================");
		System.out.println("ID : " + id);
		System.out.println("NaAme : " + name);
		System.out.println(schoolname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIBSIBdemo i = new IIBSIBdemo();
		i.print();
		
		IIBSIBdemo id = new IIBSIBdemo(200, "SPARK");
		id.print();
		
	}

}
