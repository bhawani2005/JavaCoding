package methodOverloding;

import java.util.Scanner;

class Addition{
	public static int add(int a, int b) {
		return (a+b);
	}
	
	public static double add(double a, double b) {
		return (a+b);
	}
	
	public static double add(int a, double b) {
		return (a+b);
	}
}

public class AdditionProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to find sum of two integer values");
		System.out.println("Enter 2 to find sum of two double values");
		System.out.println("Enter 3 to find sum of one integer and one double value");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter two integer number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition of Two number :"+Addition.add(a, b));
			break;
		}
		case 2: {
			System.out.println("Enter two Decimal number: ");
			double a=sc.nextDouble();
			Double b=sc.nextDouble();
			System.out.println("Addition of Two number :"+Addition.add(a, b));
			break;
		}
		case 3: {
			System.out.println("Enter first Decimal number: ");
			Double a=sc.nextDouble();
			System.out.println("Enter Second Integer number: ");
			int b=sc.nextInt();
			System.out.println("Addition of Two number :"+Addition.add(a, b));
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
		
	}
}
