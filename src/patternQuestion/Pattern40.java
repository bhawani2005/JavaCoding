/*
5
        *         
      *   *       
    *       *     
  *           *   
* * * * * * * * *
*/ 
package patternQuestion;

import java.util.Scanner;

public class Pattern40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=((r*2)-1);
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++) {
				if(i+j==r+1||j-i==r-1||i==r) {
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
