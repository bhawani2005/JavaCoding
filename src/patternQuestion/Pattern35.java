/*
11
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     *  
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int starSpace=1;
		int space = row/2;
		for(int i=1; i<=row; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print(" ");
			}
			for(int b=1; b<=starSpace; b++) {
				System.out.print("* ");
			}
			if(i<=row/2) {
				space--;
				starSpace++;
			}
			else {
				space++;
				starSpace--;
			}
			System.out.println();
		}
		sc.close();

	}

}
