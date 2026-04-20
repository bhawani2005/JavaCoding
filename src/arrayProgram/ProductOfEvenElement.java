package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfEvenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int product = 1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				product *= arr[i];
		}
		
		System.out.println("Given Array is : "+Arrays.toString(arr));
		System.out.println("Product of even Element : "+product);
		
		sc.close();
	}
}
