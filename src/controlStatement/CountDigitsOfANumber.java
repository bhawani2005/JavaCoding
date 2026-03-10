package controlStatement;

import java.util.Scanner;

public class CountDigitsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");
		int  num = sc.nextInt();
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		System.out.println("Digit of a number : "+count);
		sc.close();

	}

}
