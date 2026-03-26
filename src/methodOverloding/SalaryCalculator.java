package methodOverloding;

import java.util.Scanner;

class Employee{
	public static double calculateSalary(double basic) {
		return (basic+(basic*0.1));
	}
	
	public static double calculateSalary(double basic, double bonus) {
		return (basic+(basic*(bonus/100)));
	}
	
	public double calculateSalary(double basic, double bonus, double tax) {
		
		return (basic +(basic*(bonus/100))-(basic*(tax/100)));
	}
}

public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic Salary: ");
		double basic = sc.nextDouble();
		System.out.println("Enter your Bonus: ");
		double bonus = sc.nextDouble();
		System.out.println("Enter your tax: ");
		double tax = sc.nextDouble();
		System.out.println("Basic salary After add 10% Bonus :"+Employee.calculateSalary(basic));
		System.out.println("Basic salary After add Employee Demanded Bonus: "+Employee.calculateSalary(basic, bonus));
		Employee ob = new Employee();
		System.out.println("Basic salary pluse bonus with Tax: "+ob.calculateSalary(basic, bonus, tax));
		sc.close();
	}
	
}
