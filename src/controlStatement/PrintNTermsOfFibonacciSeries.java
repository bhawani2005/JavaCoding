package controlStatement;

import java.util.Scanner;

public class PrintNTermsOfFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int range = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 1;
		while(i<=range) {
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			i++;
		}
		sc.close();
	}

}
