package controlStatement;

import java.util.Scanner;

public class PrintAllFactorOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int i=1;
		System.out.println("Factors of a number :");
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}

}
