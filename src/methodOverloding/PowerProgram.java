package methodOverloding;

import java.util.Scanner;

class Power{
	public static int powerFind(int base, int exp) {
		int pow=1;
		for(int i=1; i<=exp; i++) {
			pow *= base;
		}
		return pow;
	}
	
	public static double powerFind(double base, int exp) {
		double pow=1;
		for(int i=1; i<=exp; i++) {
			pow *= base;
		}
		return pow;
	}
}

public class PowerProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to calculate power of integer base");
		System.out.println("Enter 2 to calculate power of double base");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter base number: ");
			int base=sc.nextInt();
			System.out.println("Enter exponent value: ");
			int exp=sc.nextInt();
			System.out.println(base+" to the power "+exp+" is :"+Power.powerFind(base, exp));
			break;
		}
		case 2: {
			System.out.println("Enter Dacimal base number: ");
			Double base=sc.nextDouble();
			System.out.println("Enter exponent value: ");
			int exp=sc.nextInt();
			System.out.println(base+" to the power "+exp+" is :"+Power.powerFind(base, exp));
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
