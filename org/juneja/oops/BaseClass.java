package org.juneja.oops;

public class BaseClass {
	
	int id ;
	String name ;
	double asset ;
	
	public BaseClass() {		
		this.id = 0;
		this.name = "DEFAULT";
		this.asset = 0.0d;
		System.out.println("BaseClass without any param");
	}
	public BaseClass(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("BaseClass with two params");
		
	}
	public BaseClass(int id, String name, double asset) {
		this.id = id;
		this.name = name;
		this.asset = asset;
		System.out.println("BaseClass with three params");
		
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", asset=" + asset
				+ "]";
	}
	
	public void display(){
		System.out.println(" Base id    : " + id);
		System.out.println(" Base name  : " + name);
		System.out.println(" Base asset : " + asset);
	}
	
	public double asset(){
		return asset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
