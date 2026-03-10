package controlStatement;

import java.util.Scanner;

public class CheckAutomorphicNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int countDigit = ((int) Math.log10(num))+1;
		System.out.println("number of digit : "+countDigit);
		int squareNum = num*num;
		System.out.println("Square of number : "+squareNum);
		
		int lastDigit = squareNum % ((int)Math.pow(10, countDigit));
		System.out.println("Last digit of number : "+lastDigit);
		if(num == lastDigit) {
			System.out.println("Automorphic Number.");
		}
		else {
			System.out.println("Not Automorphic Number.");
		}
		sc.close();
	}

}
