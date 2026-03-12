/*
5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		int space = 0;
		int star = (row*2)-1;
		for(int i=1; i<=row; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print("  ");
			}
			for(int b=1; b<=star; b++) {
				System.out.print("* ");
			}
			space++;
			star-=2;
			System.out.println();
		}
		sc.close();
	}

}
