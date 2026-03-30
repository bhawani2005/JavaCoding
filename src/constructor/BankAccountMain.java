package constructor;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Bhawani Shankar Dhara", "1235876940", 20000, "savings");
		ba1.displayAccount();
		System.out.println("------------------------------------------------------------------------------");
		BankAccount ba2 = new BankAccount("Ankit Rathore", "1238486957", 1254632, "Current", 2);
		ba2.displayAccount();
	}
}


class BankAccount{
	String accountHolderName;
	String accountNumber;
	double balance;
	String accountType;
	int interestRate;
	
	BankAccount(String accountHolderName, String accountNumber, double balance, String accountType){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.interestRate = calculateInterest();
	}
	
	BankAccount(String accountHolderName, String accountNumber, double balance, String accountType, int interestRate){
		this(accountHolderName, accountNumber, balance, accountType);
		this.interestRate = interestRate;
	}
	
	public int calculateInterest() {
		if(accountType == "Savings" || accountType == "savings") {
			return 4;
		}
		else {
			return 2;
		}
	}
	
	public void displayAccount() {
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account Type: "+accountType);
		System.out.println("Interest Rate: "+interestRate);
		
	}
}