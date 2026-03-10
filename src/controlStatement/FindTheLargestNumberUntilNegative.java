package controlStatement;

import java.util.Scanner;

public class FindTheLargestNumberUntilNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = 0;
		while(true) {
			System.out.print("Enter a number : ");
			int num=sc.nextInt();
			if(num>=0) {
				if(num>largest) {
					largest = num;
				}
			}
			else {
				break;
			}
		}
		System.out.println("Largest Number : "+largest);
		sc.close();

	}

}
