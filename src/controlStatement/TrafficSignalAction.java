package controlStatement;

import java.util.Scanner;

public class TrafficSignalAction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic light color : ");
		String light = sc.next();
		if(light.equals("red")) {
			System.out.println("Stop");
		}
		else if(light.equals("Yellow")) {
			System.out.println("Prepare");
		}
		else if(light.equals("Green")) {
			System.out.println("Go");
		}
		else {
			System.out.println("Invalid signal");
		}
		sc.close();
	}

}
