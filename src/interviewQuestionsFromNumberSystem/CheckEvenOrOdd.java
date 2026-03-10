//WAP to check whether the given number is even or odd.
package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even number.");
		}
		else {
			System.out.println(num+" is Odd number.");
		}
		sc.close();
	}

}
