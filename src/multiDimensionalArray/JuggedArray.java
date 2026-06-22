package multiDimensionalArray;

import java.util.Scanner;

public class JuggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Row size of a jugged array : ");
		int [][] arr = new int[sc.nextInt()][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter "+(i+1)+" row's column size: ");
			arr[i] = new int[sc.nextInt()];
			System.out.println("Enter row element : ");
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Array Elements Are : ");
		for(int i=0 ;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
