package controlStatement;

import java.util.Scanner;

public class RainingUmbrellaPrompt {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter True or False ");
		boolean rain = sc.nextBoolean();
		if(rain == true) {
			System.out.println("Take umbrella");
		}
		sc.close();
	}
}
