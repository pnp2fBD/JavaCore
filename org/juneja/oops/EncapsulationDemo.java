package org.juneja.oops;

class person {
	
	private int id;
	private String name;
	private double income;
			
			
	
	public void disp() {
		System.out.println("[id=" + id + ", name=" + name + ", income=" + income
				+ "]");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
		
	
}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1 = new person();
		
		p1.setId(100);
		p1.setName("VEERA");
		p1.setIncome(2000123.99);
		
		//p1.disp();
		
		EncapsulationTest D = new EncapsulationTest();
		D.getperson(p1);
		
		
	}

}
