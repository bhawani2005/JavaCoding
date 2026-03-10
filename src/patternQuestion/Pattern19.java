/*
10  11  12  13  14  
15  16  17  18  19  
20  21  22  23  24  
25  26  27  28  29  
30  31  32  33  34  
*/
package patternQuestion;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 10;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
