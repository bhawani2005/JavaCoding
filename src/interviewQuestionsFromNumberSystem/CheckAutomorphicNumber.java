package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckAutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = ((int)Math.log10(num))+1;
		int square = num*num;
		int ld = (int) (square%(Math.pow(10, count)));
		if(num == ld) {
			System.out.println("Automorphic number. ");
		}
		else {
			System.out.println("NOT Automorphic number.");
		}
		sc.close();
	}

}
 