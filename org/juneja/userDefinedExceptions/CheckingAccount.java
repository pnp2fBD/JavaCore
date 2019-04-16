package org.juneja.userDefinedExceptions;

public class CheckingAccount {
	
	private double balance;
	private double number;
	

	public CheckingAccount(int number) {
		this.number = number;
	}
	
	public void deposit(double amount) throws InvalidAmountToDeposit{
		if (amount > 0) {
			balance += amount;
			System.out.println("::: Deposit Done ::: Updated balance ::: " + balance);
		}else {
			System.out.println("::: Transaction failed ::: Existing Balance " + balance);
			throw new InvalidAmountToDeposit("Cannot Deposit Negative Value");
		}
		
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if( balance > amount){
			balance -= amount;
			System.out.println("::: Withdrawal Done ::: Updated Balacne ::: " + balance);
		}
		else{
			double needs = balance - amount;
			System.out.println("::: Transaction Failed :: Existing Balance :: " + balance);
			throw new InsufficientFundsException(needs);
			//throw new ArithmeticException();
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
		
}
