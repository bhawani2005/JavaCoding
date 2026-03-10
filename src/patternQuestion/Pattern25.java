/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4    
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=((n*2)-1); i++){
			for(int j=1; j<=((n*2)-1);j++) {
				int top = i;
				int bottom = (n*2)-top;
				int left = j;
				int right = (n*2)-left;
				int min_value = Math.min(Math.min(top, bottom),Math.min(left,right));
				System.out.print(" "+((n+1)-min_value));
			}
			System.out.println();
		}
		sc.close();
	}

}
