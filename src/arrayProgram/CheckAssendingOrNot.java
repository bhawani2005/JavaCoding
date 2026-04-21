package arrayProgram;

import java.util.Scanner;

public class CheckAssendingOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		if(checkShorted(arr)) {
			System.out.println("Shorted in Assending Order.");
		}
		else {
			System.out.println("Not shorted in Assending Order.");
		}
		sc.close();
	}
	
	public static boolean checkShorted(int arr[]) {
		boolean isAss =false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				isAss = true;
			}
			else {
				isAss = false;
				return isAss;
			}
		}
		return isAss;
	}
}
