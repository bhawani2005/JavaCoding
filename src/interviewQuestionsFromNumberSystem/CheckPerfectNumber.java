package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println("number is perfect number.");
		}
		else {
			System.out.println("number is NOT perfect number.");
		}
		sc.close();
	}

}
