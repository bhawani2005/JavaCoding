package controlStatement;

import java.util.Scanner;

public class TemperatureClassification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature(Integer) : ");
		int mark = sc.nextInt();
		if(mark<15) {
			System.out.println("Cold");
		}
		else {
			System.out.println("Warm");
		}
		sc.close();

	}

}
