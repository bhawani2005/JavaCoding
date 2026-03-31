package constructorOverlodingQuestion;

public class Qsn4 {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Bhawani Shankar Dhara", 1236548597, 15000, 6);
		ba1.displayAccount();
		
		BankAccount ba2 = new BankAccount("Hemanta Kumar", 456739182, 36000, 2, 6);
		ba2.displayAccount();
	}
}

class BankAccount{
	String accountHolder;
	int accountNumber;
	double balance;
	double years;
	double interestRate;
	
	public BankAccount(String accountHolder, int accountNumber, double balance, double years) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.years = years;
		calculateInterest();
	}

	public BankAccount(String accountHolder, int accountNumber, double balance, double years,double interestRate) {
		this(accountHolder,accountNumber,balance,years);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		if(interestRate==0.0) {
			if(years>5) {
				interestRate=8;
			}
			else if(years>2) {
				interestRate=6;
			}
			else {
				interestRate=4;
			}
		}
	}
	
	public void displayAccount() {
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Years: "+years);
		System.out.println("Interest Rate: "+interestRate);
	}
	
	
	
}