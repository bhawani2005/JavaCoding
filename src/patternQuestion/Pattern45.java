package patternQuestion;

import java.util.Scanner;

public class Pattern45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int space = r-1;
		int star = 1;
		for(int i=1; i<=r; i++) {
			for(int a=1; a<=star; a++){
				System.out.print("* ");
			}
			for(int b=1; b<=space; b++) {
				System.out.print("  ");
			}
			for(int c=1; c<=star; c++) {
				System.out.print("* ");
			}
			if(i<=r/2) {
				star++;
				space-=2;
			}
			else {
				star--;
				space+=2;
			}
			System.out.println();
		}
		sc.close();
	}

}
