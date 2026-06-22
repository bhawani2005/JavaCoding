package multiDimensionalArray;

import java.util.Scanner;

public class FindTheSumOfRowAndColumn {
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
		
		printSumOfRowAndColumn(arr1);
		sc.close();
	}
	
	public static void printSumOfRowAndColumn(int arr[][]) {
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of Row"+(i+1)+" "+sum);
		}
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[j][i];
			}
			System.out.println("Sum of Column"+(i+1)+" "+sum);
		}
	}
}
