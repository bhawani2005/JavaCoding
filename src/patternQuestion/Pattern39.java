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

public class Pattern39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(i==row||j==row||i+j==row+1) {
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
