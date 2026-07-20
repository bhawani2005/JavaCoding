package string;

import java.util.Scanner;

public class PrintUppercaseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		String upper = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32);
			}
			
			upper+=ch;
		}
		
		System.out.println("Uppercase : "+upper);
		sc.close();
		
		//============================================
		
		System.out.println(s.toUpperCase());
	}
}
