package multiDimensionalArray;

import java.util.Scanner;

public class ProductOfTwoMatrix {
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
		
		System.out.println();
		
		int [][]arr2 = new int [r][c];
		System.out.println("Enter second Matrix : ");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		productOfMatrix(arr1, arr2);
		sc.close();
	}
	
	
	public static void productOfMatrix(int arr1[][], int arr2[][]) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				int sum = 0;
				for(int k=0; k<arr1.length; k++) {
					sum += (arr1[k][i] * arr2[k][j]);
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
