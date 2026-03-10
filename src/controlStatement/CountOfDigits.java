package controlStatement;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		int count = 0;
		/*while(num!=0){
			count++;
			num=num/10;
		}*/
		for(int i=num; i!=0; i=i/10) {
			count++;
		}
		System.out.println("Number of digits are : "+count);
		sc.close();
	}

}
