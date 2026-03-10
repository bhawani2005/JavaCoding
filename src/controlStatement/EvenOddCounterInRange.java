package controlStatement;

import java.util.Scanner;

public class EvenOddCounterInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting value : ");
		int s = sc.nextInt();
		System.out.print("Enter Ending value : ");
		int e = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		for(int i = s; i<=e; i++) {
			if(i%2==0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("Number of even number are : "+count1);
		System.out.println("Number of odd number are : "+count2);
		sc.close();
	}

}
