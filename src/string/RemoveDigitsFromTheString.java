package string;

import java.util.Scanner;

public class RemoveDigitsFromTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		String ans = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!Character.isDigit(ch)) {
				ans+=ch;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
