package controlStatement;

import java.util.Scanner;

public class ValidateANumberBetweenRange {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Enter a value of n : ");
				int  num = sc.nextInt();
				if(num<=10 && num>=1) {
					System.out.println("Valid Number...");
					break;
				}
				else {
					System.out.println("Invalid Number! Enter Again....");
				}
			}
		}
	}

}
