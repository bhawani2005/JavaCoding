package arrayProgram;

import java.util.Scanner;

public class EvenIndexElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		evenIndexValuPrint(arr);
		sc.close();
	}
	
	public static void evenIndexValuPrint(int arr[]) {
		System.out.println("Even index Elements: ");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
