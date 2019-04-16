package org;

public class ComparableDemo {
	
	private int id;
	private String name;
	private double sal;

	

	public ComparableDemo(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComparableDemo virat = new ComparableDemo(100, "VIART", 1000);
		ComparableDemo rohit = new ComparableDemo(101, "ROHIT", 1001);
		ComparableDemo shikhar = new ComparableDemo(99, "SHIKHAR", 999);
		
		System.out.println("Compare Two Object " + virat.compareTo(rohit));

	}



	private String compareTo(ComparableDemo rohit) {
		// TODO Auto-generated method stub
		return null;
	}




}
