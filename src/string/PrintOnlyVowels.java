package string;

import java.util.Scanner;

public class PrintOnlyVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
			case 'A','E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println(s.charAt(i));
			}
		}
		
		sc.close();
	}
}
