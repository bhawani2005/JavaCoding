/*
5
* * * * * 
*     *   
*   *     
* *       
* 
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(i==1||j==1||i+j==row+1) {
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
