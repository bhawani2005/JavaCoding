package PrecticsQuestion;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=((2*n)-1); i++) {
			for(int j=1; j<=((2*n)-1); j++) {
				int top=i;
				int buttom = (2*n)-top;
				int left = j;
				int right = (2*n)-left;
				int minVal = Math.min(Math.min(top, buttom), Math.min(left, right));
				System.out.print(" "+((n+1)-minVal));
			}
			System.out.println();
		}
		sc.close();
	}

}
