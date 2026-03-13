/*
6
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 */
package patternQuestion;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int starSpace=1;
		int space = row-1;
		for(int i=1; i<=row; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print(" ");
			}
			for(int b=1; b<=starSpace; b++) {
				System.out.print("* ");
			}
			space--;
			starSpace++;
			System.out.println();
		}
		sc.close();
	}

}
