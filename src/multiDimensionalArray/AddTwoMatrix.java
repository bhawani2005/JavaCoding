package multiDimensionalArray;

import java.util.Scanner;

public class AddTwoMatrix {
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
		System.out.println("Addition of two matrix is : ");
		addMatrix(arr1, arr2);
		sc.close();
	}
	
	public static void addMatrix(int arr1[][], int arr2[][]) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}
	}
}
