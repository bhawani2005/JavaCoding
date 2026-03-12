package PrecticsQuestion;

import java.util.Scanner;

public class ex8 {

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
