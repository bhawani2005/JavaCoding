package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = ((int)Math.log10(num))+1;
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int ls = temp%10;
			sum += Math.pow(ls, count);
			temp /= 10;
		}
		if(sum == num) {
			System.out.println("Armstrong number.");
		}
		else {
			System.out.print("Not a Armstrong number.");
		}
		sc.close();
	}

}
