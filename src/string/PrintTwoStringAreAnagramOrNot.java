package string;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTwoStringAreAnagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two String One By One: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char []sa1 = s1.toCharArray();
		char []sa2 = s2.toCharArray();
		
		Arrays.sort(sa1);
		Arrays.sort(sa2);
		
		if(Arrays.equals(sa1, sa2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		sc.close();
	}
}
