package controlStatement;

import java.util.Scanner;

public class MultiplicationTableOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");
		int  num = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num+" X "+i+" = "+(num*i));
			i++;
		}
		sc.close();
	}

}
