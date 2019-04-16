package org.juneja.Interface;

interface Shape{
	public void draw();
}

class circle implements Shape{

	@Override
	public void draw() {
		System.out.println(" Circle Shape ");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println(" Square Shape ");	
	}
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println(" Rectangular Shape ");	
	}
}

class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println(" Triangle Shape ");	
	}
}

public class LooseCouplingUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.draw();
		Square s = new Square();
		s.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
		
		Shape sh = new circle();
		sh.draw();
		sh = new Square();
		sh.draw();
		// Parent can refer any of the child on the fly - loosely coupled data type
		Shape sh1 = new Triangle();
		Shape sh2 = new Square();
		sh1 = sh2;  // Loosely Coupled
		sh1.draw();  // will Display Square
		
	}

}
