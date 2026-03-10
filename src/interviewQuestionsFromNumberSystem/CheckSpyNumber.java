package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckSpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		int product=1;
		while(temp!=0) {
			int ld = temp%10;
			sum+=ld;
			product*=ld;
			temp/=10;
		}
		if(sum==product) {
			System.out.println("Spy number.");
		}
		else {
			System.out.println("NOT Spy number.");
		}
		sc.close();
	}

}
