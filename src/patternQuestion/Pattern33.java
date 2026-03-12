/*
9
         *
       * *
     * * *
   * * * *
 * * * * *
   * * * *
     * * *
       * *
         *
 * */
package patternQuestion;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		if(row%2==0) {
			System.out.println("Row number should be odd....");
		}
		else {
			int star = 1;
			int space = 4;
			for(int i=1; i<=row; i++) {
				for(int a=1; a<=space; a++) {
					System.out.print("  ");
				}
				for(int b=1; b<=star; b++) {
					System.out.print(" *");
				}
				if(i<=row/2) {
					space--;
					star++;
				}
				else {
					space++;
					star--;
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
