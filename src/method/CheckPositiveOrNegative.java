package method;

import java.util.Scanner;

public class CheckPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		checkNumber(num);
		sc.close();
	}
	
	public static void checkNumber(int num) {
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
}
