package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class SumOfADigitOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int ld = num%10;
			sum+=ld;
			num/=10;
		}
		System.out.println("Sum of a digit of a number : "+sum);
		sc.close();
	}

}
