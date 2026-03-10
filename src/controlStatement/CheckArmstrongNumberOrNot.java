package controlStatement;

import java.util.Scanner;

public class CheckArmstrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = ((int) Math.log10(num))+1;
		int temp = num;
		int sum=0; 
		while(temp!=0) {
			int digit = temp%10;
			sum += Math.pow(digit, count);
			temp = temp/10;
		}
		if (sum == num) {
			System.out.println("It is a Armstrong Number.");
		}
		else {
			System.out.println("It is not a Armstrong Number.");
		}
		sc.close();
	}

}
