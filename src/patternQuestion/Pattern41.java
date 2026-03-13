/*
11
          * 
        *   * 
      *       * 
    *           * 
  *               * 
*                   * 
  *               * 
    *           * 
      *       * 
        *   * 
          * 
 */
package patternQuestion;

import java.util.Scanner;

public class Pattern41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int star=1;
		int space = row/2;
		for(int i=1; i<=row; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print("  ");
			}
			for(int b=1; b<=star; b++) {
				if(b==1||b==star) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<=row/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			System.out.println();
		}
		sc.close();

	}

}
