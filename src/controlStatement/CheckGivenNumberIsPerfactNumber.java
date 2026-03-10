package controlStatement;

import java.util.Scanner;

public class CheckGivenNumberIsPerfactNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num/2; i++) {
			if(num%1 == 0) {
				sum = sum+i;
			}
		}
		if(num == sum) {
			System.out.println("Number is perfact number.");
		}
		else {
			System.out.println("Number is not perfact number.");
		}
		sc.close();
	}

}
