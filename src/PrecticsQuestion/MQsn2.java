package precticsQuestion;

import java.util.Scanner;

public class MQsn2 {
	public static void printStar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			System.out.print("*");
		}
		sc.close();
	}
	public static void main(String[] args) {
		printStar();
	}
}
