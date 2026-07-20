package string;

import java.util.Scanner;

public class SumOfGivenDigitInGivenIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.nextLine();
		
		int sum = 0;
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if(Character.isDigit(ch)) {
				sum = sum+(ch-48);
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
