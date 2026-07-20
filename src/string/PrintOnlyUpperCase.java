package string;

import java.util.Scanner;

public class PrintOnlyUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
			}
		}
		
		sc.close();
	}
}
