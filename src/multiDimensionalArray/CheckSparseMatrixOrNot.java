package multiDimensionalArray;

import java.util.Scanner;

public class CheckSparseMatrixOrNot {
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
		
		if(isSparseMatrix(arr1)) {
			System.out.println("Matrix is Sparse.");
		}
		else {
			System.out.println("Matrix is Not Sparse.");
		}
		sc.close();
	}
	
	public static boolean isSparseMatrix(int arr[][]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] == 0) {
					count++;
				}
			}
		}
		if(count>(arr.length*arr.length)/2) {
			return true;
		}
		else {
			return false;
		}
	}
}
