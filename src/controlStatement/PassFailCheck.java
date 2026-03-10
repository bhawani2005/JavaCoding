package controlStatement;

import java.util.Scanner;

public class PassFailCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int mark = sc.nextInt();
		if(mark>=40) {
			System.out.println("Pass!");
		}
		else {
			System.out.println("Fail!");
		}
		sc.close();
	}
}
