package arrayProgram;

import java.util.Scanner;

public class ElementExistsInTheArrayOrNot_LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter an Array Element: ");
		int n = sc.nextInt();
		
		boolean isPresent = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==n) {
				isPresent = true;
				break;
			}
		}
		if(isPresent) {
			System.out.println(n+" is prasent in array.");
		}
		else {
			System.out.println(n+" is not present in array.");
		}
		sc.close();
	}
}
