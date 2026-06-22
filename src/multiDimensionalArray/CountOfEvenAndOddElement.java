package multiDimensionalArray;

import java.util.Scanner;

public class CountOfEvenAndOddElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix rows : ");
		int r = sc.nextInt();
		
		System.out.println("Enter matrix coloms : ");
		int c = sc.nextInt();
		
		
		int [][]arr1 = new int [r][c];
		System.out.println("Enter first Matrix: ");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		frequencyOfEvenAndOdd(arr1);
		sc.close();
	}
	
	public static void frequencyOfEvenAndOdd(int arr[][]) {
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] % 2 == 0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
			}
		}
		
		System.out.println("Frequency of Even Elements : "+evenCount);
		System.out.println("Frequency of odd Elements : "+oddCount);
	}
}
