package arrayProgram;

import java.util.Scanner;

public class CountOfEvenOddElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("Even Elements Count: "+evenCount);
		System.out.println("Odd Elements Count: "+oddCount);
		sc.close();
	}
}
