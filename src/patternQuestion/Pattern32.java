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
* j
 * */
package patternQuestion;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		if(row%2==0) {
			System.out.print("Enter row value should be odd");
		}
		else {
			int star = 1;
			for(int i=1; i<=row; i++) {
				for(int a=1; a<=star; a++) {
					System.out.print("* ");
				}
				if(i<=row/2) {
					star++;
				}
				else {
					star--;
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
