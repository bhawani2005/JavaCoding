package arrayProgram;

import java.util.Scanner;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		averageOfArray(arr);
		sc.close();
	}
	
	public static void averageOfArray(int []arr) {
		int sum=0;
		for(int n : arr) {
			sum+=n;
		}
		System.out.println("Average of Element: "+(sum/arr.length));
	}
}
