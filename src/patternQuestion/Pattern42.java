package patternQuestion;

import java.util.Scanner;

public class Pattern42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int space = r-1;
		int nums = 1;
		for(int i=0; i<=r-1; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print(" ");
			}
			int x=1;
			int nume = i;
			int dene = 1;
			for(int b=1; b<=nums; b++) {
				System.out.print(x+" ");
				x=((x*nume)/dene);
				nume--;
				dene++;
			}
			space--;
			nums++;
			System.out.println();
		}
		sc.close();

	}

}
