package exceptionProgram;

import java.util.Scanner;

public class Qns1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String accountNumber = sc.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = sc.nextLine();
		System.out.println("Enter You Balance: ");
		double balance = sc.nextInt();
		
		
		BankAccount ba = new BankAccount(accountNumber, accountHolderName, balance);
		
		try {
			ba.deposit(-500);
		}
		catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

class BankAccount{
	public String accountNumber;
	public String accountHolderName;
	public double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount<=0) {
			throw new InsufficientBalanceException("Invalid Withdrawal Amount");
		}
		else if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {
			System.out.println("Withdrawal of amount "+amount+" is successful");
		}
	}
	
	public void deposit(double amount) throws InsufficientBalanceException{
		if(amount<=0) {
			throw new InsufficientBalanceException("Invalid deposite Amount");
		}
		else {
			System.out.println("Amount of "+amount+" is deposited successfully");
		}
	}
}


class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}