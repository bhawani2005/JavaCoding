package controlStatement;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int ld = temp%10;
			rev = (rev*10)+ld;
			temp = temp/10;
		}
		if(num==rev) {
			System.out.println("Number is Palindrome.");
		}
		else {
			System.out.println("Number is not Palindrome.");
		}
		sc.close();

	}

}
