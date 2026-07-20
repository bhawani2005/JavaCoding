package string;

import java.util.Scanner;

public class PrintLowercaseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		String lower = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch = (char)(ch+32);
			}
			
			lower+=ch;
		}
		
		System.out.println("Uppercase : "+lower);
		sc.close();
		
		//===================================================
		System.out.println(s.toLowerCase());
	}
}
