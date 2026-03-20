package method;

import java.util.Scanner;

public class FindSquare {
	public static void main(String[] args) {
		int squr = getSquare();
		System.out.println(squr);
	}
	
	public static int getSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		return (n*n);
		
	}
}
