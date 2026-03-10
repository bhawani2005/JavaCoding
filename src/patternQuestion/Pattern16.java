package patternQuestion;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count+" ");
			}
			System.out.println();
			count--;
		}
		sc.close();
	}
}
/*
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 

 */