package controlStatement;

import java.util.Scanner;

public class PasswordGuessWithLimitedAttempts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many attempts Enter the value : ");
			int attempts = sc.nextInt();
			int password = 1234;
			System.out.print("Enter password :");
			int i=1;
			for( ; i<=attempts; i++) {
				int attemptsPassword = sc.nextInt();
				if(attemptsPassword == password) {
					System.out.println("Access Granted!");
					break;
				}
				else {
					System.out.println("Try Again!");
				}
			}
			if(i == attempts+1) {
				System.out.print("Attempts reached....");
			}
			sc.close();
		}
	}

}
