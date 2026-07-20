package string;

import java.util.Scanner;

public class CountAlphabatDigitAndSymbol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		int alphabetCount = 0;
		int digitCount = 0;
		int symbolCount = 0;
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z') {
//				alphabetCount++;
//			}
//			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
//				digitCount++;
//			}
//			else {
//				symbolCount++;
//			}
//		}
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alphabetCount++;
			}
			else if(Character.isDigit(s.charAt(i))) {
				digitCount++;
			}
			else {
				symbolCount++;
			}
		}
		
		System.out.println("Alphabet count : "+alphabetCount);
		System.out.println("Digit count : "+digitCount);
		System.out.println("Symbol count : "+symbolCount);
		
		sc.close();
	}
}
