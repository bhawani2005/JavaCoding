package method;

import java.util.Scanner;


public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		checkVotingEligibility(age);
		sc.close();
		
	}
	
	public static void checkVotingEligibility(int age) {
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
