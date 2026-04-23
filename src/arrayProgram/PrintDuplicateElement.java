package arrayProgram;

import java.util.Scanner;

public class PrintDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		printDuplicate(arr);
		sc.close();
	}
	
	public static void printDuplicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=i-1; j>=0; j--) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println(arr[i]);
			}
		}
	}
}
