package org.juneja.oops;

public class AbstractDemo extends AbstractTest {

	public AbstractDemo(int id, String name) {
		super(id, name);
		System.out.println(" ---Calling Super from child class -----");
		
	}

	@Override
	public void add() {
		System.out.println( "Abstarct ADD method Implemented here in child class");
	}

	@Override
	public void sub() {
		System.out.println( "Abstarct SUB method Implemented here in child class");
	}

	@Override
	public void mult() {
		System.out.println( "Abstarct MULT method Implemented here in child class");
	}

	@Override
	public void div() {
		System.out.println( "Abstarct DIV method Implemented here in child class");
	}

	public static void main(String[] args) {
		
		AbstractDemo ad = new AbstractDemo(100, "YUVI");
		
		AbstractDemo ad2 = new AbstractDemo(102, "MSD");
		
		ad.disp();
		
		//ad2.disp();

	}

}


