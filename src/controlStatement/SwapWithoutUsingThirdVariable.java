package controlStatement;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter a value of b : ");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a:" +a);
		System.out.println("Value of a:" +b);
		sc.close();
	}

}
