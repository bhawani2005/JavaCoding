package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CountNumberOfADigitInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		System.out.print("Number od Digit in a number : "+count);
		sc.close();
	}

}
