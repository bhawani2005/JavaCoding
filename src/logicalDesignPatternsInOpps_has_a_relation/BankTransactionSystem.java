package logicalDesignPatternsInOpps_has_a_relation;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionSystem {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Ankit", 50000);
		Customer c2 = new Customer("Hemanta", 15000);
		
		List<Customer> customers = new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		
		Bank b1 = new Bank(customers);
		
		PhonePe pp1 = new PhonePe(b1);
		pp1.transfer(c1, 2000);
	}
}

class BankAccount{
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited :"+amount);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawn: "+amount);
	}
	
	public double getBalance() {
		return balance;
	}
	
}

class Customer{
	public String name;
	public BankAccount account;
	
	public Customer(String name, double balance) {
		this.name = name;
		this.account = new BankAccount(balance);
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
}

class Bank{
	
	private List<Customer> customers;

	public Bank(List<Customer> customers) {
		this.customers = customers;
	
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
	
}

class PhonePe{
	public Bank bank;
	
	public PhonePe(Bank bank) {
		this.bank = bank;
	}
	
	public void transfer(Customer customer, double amount) {
		System.out.println("Using PhonePe....");
		customer.getAccount().withdraw(amount);
		System.out.println("Updated Balance: "+customer.getAccount().getBalance());
	}
}





