package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckWhetherANumberIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int rev=0;
		while(temp!=0) {
			int ld = temp%10;
			rev = (rev*10)+ld;
			temp /= 10;
		}
		if(num == rev) {
			System.out.println("Number is Palindrom.");
		}
		else {
			System.out.println("Number is NOT Palindrom.");
		}
		sc.close();
	}

}
