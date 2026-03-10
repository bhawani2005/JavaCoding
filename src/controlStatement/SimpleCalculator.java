package controlStatement;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("              CALCULATOR ");
		System.out.println("---------------------------------------");
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("Enter : 1 for Addition");
		System.out.println("Enter : 2 for Subtraction");
		System.out.println("Enter : 3 for Multiplication");
		System.out.println("Enter : 4 for Division(Quotient)");
		System.out.println("Enter : 5 for Division(Remainder)");
		System.out.println("---------------------------------------");
		System.out.print("Enter Your choice : ");
		int choice = sc.nextInt();
		System.out.println("---------------------------------------");
		 
		switch(choice) {
		case 1 : {
			System.out.println("Addition of two number "+num1+" and "+num2+" is : "+(num1+num2));
		}break;
		case 2 : {
			System.out.println("Addition of two number "+num1+" and "+num2+" is : "+(num1-num2));
		}break;
		case 3 : {
			System.out.println("Addition of two number "+num1+" and "+num2+" is : "+(num1*num2));
		}break;
		case 4 : {
			System.out.println("Addition of two number "+num1+" and "+num2+" is : "+(num1/num2));
		}break;
		case 5 : {
			System.out.println("Addition of two number "+num1+" and "+num2+" is : "+(num1%num2));
		}break;
		default : System.out.println("Invalid Choice! Please select a valid operation.");
		}
		sc.close();

	}

}
