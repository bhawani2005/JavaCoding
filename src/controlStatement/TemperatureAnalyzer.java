package controlStatement;

import java.util.Scanner;

public class TemperatureAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of temperature reading : ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" temperature reading : ");
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=1; i<=n; i++) {
			int temp = sc.nextInt();
			if(temp<0) {
				count1++;
			}
			else if(temp>=0 && temp<=30) {
				count2++;
			}
			else {
				count3++;
			}
		}
		System.out.println("Cold reading is : "+count1);
		System.out.println("Mild reading is : "+count2);
		System.out.println("Hot reading is : "+count3);
		sc.close();
	}

}
