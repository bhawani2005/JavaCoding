package multiDimensionalArray;

import java.util.Scanner;

public class ReadAndPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix rows : ");
		int r = sc.nextInt();
		
		System.out.println("Enter matrix coloms : ");
		int c = sc.nextInt();
		
		
		int [][]arr = new int [r][c];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Matrix Element are : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
