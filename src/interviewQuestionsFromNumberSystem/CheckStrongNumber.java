package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int ld = temp%10;
			int fact=1;
			int i=1;
			while(i<=ld) {
				fact *= i;
				i++;
			}
			sum += fact;
			temp /=10;
		}
		if(num == sum) {
			System.out.println("Strong Number.");
		}
		else {
			System.out.println("Not a Strong number.");
		}
		sc.close();
	}

}
