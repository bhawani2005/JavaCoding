package controlStatement;

import java.util.Scanner;

public class MultiplicationTableWithConditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.print(x+" X "+i+" = "+(i*x));
			if(i<=5) {
				System.out.println(" small");
			}
			else {
				System.out.println(" large");
			}
		}
		sc.close();

	}

}
