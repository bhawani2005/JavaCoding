package multiDimensionalArray;

import java.util.Scanner;

public class CheckIdentityMatrix {
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
		
		if(checkIdentityMatrix(arr1)) {
			System.out.println("Matrix is Identity.");
		}
		else {
			System.out.println("Matrix is not Identity.");
		}
		sc.close();
	}
	
	public static boolean checkIdentityMatrix(int arr[][]) {
		boolean isIdentity = true;
		outer:
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if((i==j && arr[i][j] != 1) || (i!=j && arr[i][j] != 0)) {
					isIdentity = false;
					break outer; 
				}
			}
		}
		return isIdentity;
	}
}
