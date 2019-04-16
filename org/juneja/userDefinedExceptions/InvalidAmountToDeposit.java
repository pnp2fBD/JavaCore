package org.juneja.userDefinedExceptions;

public class InvalidAmountToDeposit extends Exception {
	
	double amount;

	public InvalidAmountToDeposit(double amount) {
		super();
		this.amount = amount;
	}

	public InvalidAmountToDeposit() {
		super();
	}

	public InvalidAmountToDeposit(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public InvalidAmountToDeposit(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidAmountToDeposit(String arg0) {
		super(arg0);
	}

	public InvalidAmountToDeposit(Throwable arg0) {
		super(arg0);
	}
	
	

}
