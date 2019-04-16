package org.juneja.oops;

//Inheritance is child of Parent/Base Class
public class InheritanceDemo extends BaseClass{
	
	double asset;
	
	public InheritanceDemo(double asset) {
		super(101,"YUVRAAJ",asset);
		this.asset = asset;
	}
	
	public InheritanceDemo() {
		super();
	}

	public double totalAsset(){
		return (this.asset + super.asset);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		BaseClass B = new BaseClass();
		
		
		BaseClass B1 = new BaseClass(100, "Sunil");
		
		
		System.out.println( "Base Class : " + B1);
		
		*/
				
		InheritanceDemo id = new InheritanceDemo();
		
		System.out.println("InheritanceDemo : " + id);
		
		InheritanceDemo id2 = new InheritanceDemo(2000000);
		
		System.out.println("InheritanceDemo : " + id2);
		
		
		
	}
	

}
