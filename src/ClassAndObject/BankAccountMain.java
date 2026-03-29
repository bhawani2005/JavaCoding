package ClassAndObject;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ob = new BankAccount();
		
		System.out.println("Enter Account Holder Name: ");
		ob.accountHolderName=sc.nextLine();
		System.out.println("Enter Account Number: ");
		ob.accountNumber=sc.next();
		System.out.println("Enter Balance: ");
		ob.balance=sc.nextDouble();
		
		System.out.println("Enter your Deposit Ammount: ");
		ob.deposite(sc.nextDouble());
		ob.displayBalance();
		
		System.out.println("Enter your Withdraw Ammount: ");
		ob.withdraw(sc.nextDouble());
		ob.displayBalance();
		
		sc.close();
		
	}
}

class BankAccount{
	public String accountHolderName;
	public String accountNumber;
	public double balance;
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficient Balance..");
		}
	}
	
	public void displayBalance() {
		System.out.println("Balance: "+balance);
	}
}
