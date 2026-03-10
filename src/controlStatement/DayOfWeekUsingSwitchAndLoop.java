package controlStatement;

import java.util.Scanner;

public class DayOfWeekUsingSwitchAndLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a input : ");
		int num = sc.nextInt();
		for(int i=1; i<=1; i++) {
			switch(num) {
			case 1 : System.out.println("Monday");
				break;
			case 2 : System.out.println("Tuesday");
				break;
			case 3 : System.out.println("Wednesday");
				break;
			case 4 : System.out.println("Thusday");
				break;
			case 5 : System.out.println("Friday");
				break;
			case 6 : System.out.println("Saturday");
				break;
			case 7 : System.out.println("Sunday");
				break;
			default : System.out.println("Enter valid Input...");
			}
		}
		
		sc.close();

	}

}
