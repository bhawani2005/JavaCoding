package string;

import java.util.Scanner;

public class ConvertUppercaseLettersToLowercaseAndViceVersa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		String ans = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				ans += (char)(s.charAt(i)+32);
			}else {
				ans += (char)(s.charAt(i)-32);
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
