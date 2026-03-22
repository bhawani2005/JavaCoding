package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn14 {
	public static void sumOfDigit(int num) {
		int sum=0;
		while(num!=0) {
			sum += (num%10);
			num /= 10;
		}
		System.out.println("Sum of digit is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sumOfDigit(num);
		sc.close();
	}
}
