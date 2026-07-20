package string;

import java.util.Scanner;

public class GivenTwoStringAreEqualOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two String One By One: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		sc.close();
	}
}
