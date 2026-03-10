package patternQuestion;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		System.out.print("Enter number of colums : ");
		int col = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
