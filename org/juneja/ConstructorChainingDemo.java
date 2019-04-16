package org.juneja;

public 	class ConstructorChainingDemo{
		int id;
		String name;
		String dob;
		
		
		
		public ConstructorChainingDemo(){  // Default Constructors
			
			this(10,"test");
			/*id=99;
			name="Java";
			dob="01-01-1900";*/
			
		}
		
		public ConstructorChainingDemo(int id, String name) { // Parameter Constructors
			super();
			this.id = id;
			this.name = name;
		}
		
		public ConstructorChainingDemo(int id, String name, String dob) { // Parameter Constructors
			super();
			this.id = id;
			this.name = name;
			this.dob = dob;
		}
				
		public void printData(){
			System.out.println ( "ID is :" + id );
			System.out.println ( "Name is :" + name );
			System.out.println ( "DOB is :" + dob );
		}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChainingDemo c = new ConstructorChainingDemo();
		
		c.printData();
		

	}

}
