package controlStatement;

import java.util.Scanner;

public class CountNumberDivisibleBy7 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0) {
			count++;
			}
		}
		System.out.println("number divisible by 7 :"+count);
		sc.close();
	}
}
