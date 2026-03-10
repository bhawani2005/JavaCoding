package controlStatement;

import java.util.Scanner;

public class PrintMultipleOf5LessThanN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int multi = 0;
		int i=1;
		while(true) {
			if(multi<num) {
				System.out.println(multi);
				multi=5*i;
				i++;
			}
			else {
				break;
			}
		}
		sc.close();
	}

}
