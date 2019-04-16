package org.juneja.oops;

public class Address {
	
	String hNO;
	int StNo;
	String StName;
	String city;
	String state;
	String county;
	long pincode;
	
	public Address(String hno, int stNo, String stName, String city,
			String state, String county, long pincode) {
		super();
		this.hNO = hno;
		StNo = stNo;
		StName = stName;
		this.city = city;
		this.state = state;
		this.county = county;
		this.pincode = pincode;
	}
	
	

	@Override
	public String toString() {
		return "[hno=" + hNO + ", StNo=" + StNo + ", StName=" + StName
				+ ", city=" + city + ", state=" + state + ", county=" + county
				+ ", pincode=" + pincode + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad  = new Address("H44", 127, "GOLF COURSE ROAD", "Gurugram", "HR", "IND", 132103);
		
		System.out.println("Address : " + ad);
		
		
	}

}
