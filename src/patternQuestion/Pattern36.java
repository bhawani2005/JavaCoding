/*
5
 *
 * *
 *   *
 *     *
 * * * * *
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =sc.nextInt();
		for (int i=1; i<=row; i++){
			for(int j=1; j<=i; j++) {
				if(j==1||i==row||i==j) {
					System.out.print(" *");
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
