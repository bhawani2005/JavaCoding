package array58Program;

import java.util.Scanner;

public class SumOfEvenIndexAndProductOfOddIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum=0, product=1;
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				sum += arr[i];
			}
			else {
				product *= arr[i];
			}
		}
		
		System.out.println("Sum of Even Index is: "+sum);
		System.out.println("Product of Odd Index is: "+product);
		sc.close();
	}
}
