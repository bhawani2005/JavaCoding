package controlStatement;

import java.util.Scanner;

public class CountHowManyInputArePositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.print("Enter a number : ");
			int num=sc.nextInt();
			if(num!=0) {
				if(num>0) {
					count++;
				}
			}
			else {
				break;
			}
		}
		System.out.println("number of Positive number : "+count);
		sc.close();
	}

}
