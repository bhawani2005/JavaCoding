package arrayProgram;

import java.util.Scanner;

public class CheckFirstRepeatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		if(checkFirstRepeatingElement(arr)>=0) {
			System.out.println("First repeating value is: "+checkFirstRepeatingElement(arr));
		}
		else {
			System.out.println("No repeating number is their..");
		}
		sc.close();
	}
	
	public static int checkFirstRepeatingElement(int []arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					return arr[i];
				}
			}
		}
		return -1;
	}
}
