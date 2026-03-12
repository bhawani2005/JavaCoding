package patternQuestion;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int space = (row-1);
		int star = 1;
		//for row value 
		for(int i=1; i<=row; i++) {
			for(int a=1; a<=space; a++) {
				System.out.print("  ");//for print space
			}
			for(int b=1; b<=star; b++) {
				System.out.print("* ");//for print star
			}
			space--;
			star +=2;
			System.out.println();
		}
		sc.close();
		
	}

}
