/*
6
1 7 12 16 19 21 
2 8 13 17 20 
3 9 14 18 
4 10 15 
5 11 
6
 */
package patternQuestion;

import java.util.Scanner;

public class Pattern43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int sum = i;
			for(int j=n; j>=i; j-- ) {
				System.out.print(sum+" ");
				sum += j;
			}
			System.out.println();
		}
		sc.close();
	}

}
