package methodOverloding;

import java.util.Scanner;

class Calculator{
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(int a, double b) {
		return a+b;
	}
}

public class Calculat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 ->{
			System.out.println("Enter a first number: ");
			int a = sc.nextInt();
			System.out.println("Enter a Second number: ");
			int b = sc.nextInt();
			sc.close();
		}
		
		}
	}
	
	
}
