package multiDimensionalArray;

import java.util.Scanner;


public class CheckTwoMatrixAreEquelOrNot {
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
		if(checkEqual(arr1, arr2)) {
			System.out.println("Matrices are Equels.");
		}
		else {
			System.out.println("Matrices are Not Equels.");
		}
		sc.close();
	}
	
	
	public static boolean checkEqual(int arr1[][], int arr2[][]) {
		boolean isEquel = true;
		outer:
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i][j] != arr2[i][j]) {
					isEquel = false;
					break outer;
				}
			}
		}
		return isEquel;
	}
}
