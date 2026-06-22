package multiDimensionalArray;

import java.util.Scanner;

public class PrintLowerTringulerMatrix {
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
		
		lowerTriangleMatrix(arr1);
		sc.close();
	}
	
	public static void lowerTriangleMatrix(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i<j) System.out.print("0 ");
				else System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
