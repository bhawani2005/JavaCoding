package methodOverloding;

import java.util.Scanner;

class MaximumNumber{
	public static int max(int a, int b) {
		return (a>b)? a:b;
	}
	
	public static int max(int a, int b, int c) {
		return ((a>b)? ((a>c)?a:c) : ((b>c)?b:c));
	}
	
	public static double max(double a, double b) {
		return (a>b)? a:b;
	}
}


public class MaximumNumberProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to find maximum of two integers");
		System.out.println("Enter 2 to find maximum of three integers");
		System.out.println("Enter 3 to find maximum of two double values");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter two integer number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Maximum of Two number :"+MaximumNumber.max(a, b));
			break;
		}
		case 2: {
			System.out.println("Enter three integer number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println("Maximum of Three number :"+MaximumNumber.max(a, b, c));
			break;
		}
		case 3: {
			System.out.println("Enter two Decimal number: ");
			double a=sc.nextDouble();
			Double b=sc.nextDouble();
			System.out.println("Maximum of Two number :"+MaximumNumber.max(a, b));
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
