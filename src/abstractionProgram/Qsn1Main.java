package abstractionProgram;

import java.util.Scanner;

public class Qsn1Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice  = sc.nextInt();
		
		System.out.println("Enter lone Amount:");
		double amount = sc.nextDouble();
		
		Payment p = PaymentFactory.getPayment(choice);
		LoanService ls = new LoanService();
		ls.clearLoan(p, amount);
	}
}

//=========================================================
interface Payment{
	boolean pay(double amount);
}

class UPIPayment implements Payment{
	public boolean pay(double amount) {
		System.out.println("Payment using UPI is done...");
		return true;
	}
}

class CreditCardPayment implements Payment{
	public boolean pay(double amount) {
		System.out.println("Payment using Credit Card is done...");
		return true;
	}
}

class CryptoPayment implements Payment{
	public boolean pay(double amount) {
		System.out.println("Payment using Crypto is done...");
		return true;
	}
}


//=========================================================


class LoanService{
	void clearLoan(Payment payment, double amount) {
		boolean isLoneCleared = payment.pay(amount);
		
		if(isLoneCleared) {
			System.out.println("Loan Cleared Successfully");
			System.out.println("Loan clearance certificate generated");
		}
		else {
			System.out.println("Payment Failed. Loan not cleared");
		}
	}
}


//=========================================================


class PaymentFactory{
	static Payment getPayment(int choice) {
		Payment p = null;
		if(choice == 1) {
			p = new UPIPayment();
		}
		else if(choice == 2) {
			p = new CreditCardPayment();
		}
		
		else if(choice == 3) {
			p = new CryptoPayment();
			
		}
		else {
			System.out.println("Invalid Choice...");
			p = null;
		}
		return p;
	}
}
