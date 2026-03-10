package controlStatement;

import java.util.Scanner;

public class CheckNeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int square = num*num;
		int digitSum=0;
		while(square!=0) {
			int ld = square%10;
			digitSum += ld;
			square /= 10;
		}
		if(num == digitSum) {
			System.out.println("Neon number.");
		}
		else {
			System.out.println("Not Neon number.");
		}
		sc.close();
	}

}
