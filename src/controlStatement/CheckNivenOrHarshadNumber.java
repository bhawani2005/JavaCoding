package controlStatement;

import java.util.Scanner;

public class CheckNivenOrHarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sumDigit = 0;
		while(temp!=0) {
			int ls = temp%10;
			sumDigit += ls;
			temp/=10;
		}
		if(num%sumDigit==0) {
			System.out.println("Number is Harshad number.");
		}
		else {
			System.out.println("Number is not Harshad number.");
		}
		sc.close();
	}

}
