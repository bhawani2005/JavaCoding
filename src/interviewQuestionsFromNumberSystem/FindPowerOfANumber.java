package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter a power of a number : ");
		int power = sc.nextInt();
		int numPower = 1;
		for(int i = 1; i<=power; i++) {
			numPower *= num;
		}
		System.out.println(num+" to the power "+power+" is : "+numPower);
		sc.close();
	}

}
