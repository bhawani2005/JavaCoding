package controlStatement;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char character = sc.next().charAt(0);
		
		switch(character) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println("Vowel");
		default -> System.out.println("Consonant");
		}
		sc.close();
	}

}
