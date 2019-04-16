package org.juneja.exception;

public class ThrowDemo {
	
	public void ageValidate(int age) throws Exception{
		if(age < 14){
			throw new Exception("Invalid age to Vote");
		}else {
			System.out.println("Successfull Age");
		}
	}

	public static void main(String[] args) throws Exception {	
		ThrowDemo td = new ThrowDemo();
		try{
			td.ageValidate(13);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(" Change Age as its an exceptio");
			try{
				td.ageValidate(15);
			}catch(Exception e2){
				e2.printStackTrace();
				System.out.println("Inner Catch Block");
			}
			
		}

	}

	

}
