package controlStatement;

import java.util.Scanner;

public class SumOfDigitOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");
		int  num = sc.nextInt();
		int sum=0;
		while(num!=0) {
			int temp = num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("sum of a digit : "+sum);
		sc.close();

	}

}
