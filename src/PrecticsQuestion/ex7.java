package precticsQuestion;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int range = sc.nextInt();
		for(int i=1; i<=range; i++) {
			int temp=i;
			int rev=0;
			while(temp!=0) {
				int ld = temp%10;
				rev=(rev*10)+ld;
				temp /= 10;
			}
			if(i==rev) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
