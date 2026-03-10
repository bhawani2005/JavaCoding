package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckDisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int count = ((int)Math.log10(num))+1;
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int ld = temp%10;
			sum += Math.pow(ld, count);
			temp /= 10;
			count--;
		}
		if(num==sum) {
			System.out.println("Disarinum Number.");
		}
		else {
			System.out.println("NOT a Disarinum Number.");
		}
		sc.close();
	}

}
