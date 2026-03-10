package controlStatement;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Month Number : ");
		int number = sc.nextInt();
		
		switch(number) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
		case 2 -> System.out.println("28 Days");
		case 4, 6, 9, 11 -> System.out.println("30 Days");
		default -> System.out.println("Invalid Number.....");
		}
		sc.close();

	}

}
