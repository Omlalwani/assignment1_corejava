package com.assignment;
import java.util.Scanner;

class BankException extends Exception{
	double amount;
	public BankException(double amount) {
		this.amount = amount;
	}
}

class BankAtm{
	double balance;
	public void deposit(double amount){
		balance = balance +amount;
		System.out.println(amount + " successfully deposited...");
	}
	
	public void withdraw(double amount) throws BankException{
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println(amount + " withdrawn succesfully");
		}else {
			double withdrawAmount = amount - balance;
			throw new BankException(withdrawAmount);
		}
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAtm Axis = new BankAtm();
		System.out.println("Enter amount to deposit :-" );
		double amount = sc.nextDouble();
		Axis.deposit(amount);
		
		System.out.println("Enter amount for withdraw :- ");
		amount = sc.nextDouble();
		try {
			Axis.withdraw(amount);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry insufficient balance, you need more " + e.amount + " to withdraw	`");
			e.printStackTrace();
		}
	}
}
