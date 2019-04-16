package org.juneja;

public class MethodOverloadingDemo {
	
	public void add(){
		System.out.println(" Hello ");
	}
	
	public void add(int i){
		System.out.println(" Hello ");
	}
	
	public void add(int i , int j, int k){
		System.out.println(" Hello ");
	}
	
	public int add(int i , int j){
		System.out.println(" Hello ");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo m = new  MethodOverloadingDemo();
		
		m.add(10,10,10);
	}

}
