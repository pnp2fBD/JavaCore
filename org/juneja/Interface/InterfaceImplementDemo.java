package org.juneja.Interface;

public class InterfaceImplementDemo implements InterfaceDemo,Interface2,Interface3{
	
	@Override
	public void changeConf() {
		System.out.println("Implemented Method");
		System.out.println("Min :" + MIN);
	}
	
	@Override
	public void display() {
		System.out.println("Display method from Interface");
		
	}
	
	@Override
	public void show() {
		System.out.println(" Method Show");
		
	}
	
	public static void main(String[] args) {
		InterfaceImplementDemo IDemo = new InterfaceImplementDemo();
		IDemo.changeConf();
		IDemo.display();
	}

	

}
