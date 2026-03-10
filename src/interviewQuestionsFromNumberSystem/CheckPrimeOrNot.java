// WAP to check whether the given number is prime or not.
package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int i=2;
		boolean flag = true;
		while(i<=num/2) {
			if(num%i==0) {
				flag=false;
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println("Number is Prime number.");
		}
		else {
			System.out.println("Number is NOT Prime number.");
		}
		sc.close();
	}

}
