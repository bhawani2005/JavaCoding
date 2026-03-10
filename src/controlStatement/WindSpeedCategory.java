package controlStatement;

import java.util.Scanner;

public class WindSpeedCategory {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Wind Speed : ");
		int speed = sc.nextInt();
		
		if(speed<5) {
			System.out.println("Calm");
		}
		else if(speed>=5 && speed<=14) {
			System.out.println("Breeze");
		}
		else if(speed>=15 && speed<=30) {
			System.out.println("Gale");
		}
		else if(speed>30) {
			System.out.println("Storm");
		}
		sc.close();
	}
}
