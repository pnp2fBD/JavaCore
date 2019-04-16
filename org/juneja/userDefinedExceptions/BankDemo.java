package org.juneja.userDefinedExceptions;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {

		CheckingAccount ca = new CheckingAccount(687188);	
		System.out.println("Depsoiting Amount of $500 ...");
		
		try{
			ca.deposit(500);
		}catch(InvalidAmountToDeposit e1){
			e1.printStackTrace();
		}
		
		try{
			Thread.currentThread().sleep(10000);
			System.out.println("\n Withdrawing Amount is $100");
			
			ca.withdraw(100);
			Thread.currentThread().sleep(10000);
			System.out.println("\n Withdrawing Amount is $700");
			ca.withdraw(700);
			
		}catch(InsufficientFundsException customexp){
			System.out.println("You are short of Amount " + customexp.getAmount());
			customexp.printStackTrace();
			System.out.println("getCause  	 		" + customexp.getCause());
			System.out.println("getCause 			" + customexp.getCause());
			System.out.println("getLocalizedMessage " + customexp.getLocalizedMessage());
			System.out.println("getClass 			" + customexp.getClass());
			System.out.println("getStackTrace 		" + customexp.getStackTrace());
		} catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			System.out.println("\n Depsoit Negative Amount");
			Thread.currentThread().sleep(10000);
			ca.deposit(-500);
		}catch(InvalidAmountToDeposit e2){
			e2.printStackTrace();
		}
	}

}
