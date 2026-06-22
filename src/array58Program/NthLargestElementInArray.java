package array58Program;


import java.util.Scanner;

public class NthLargestElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of position:");
		int n = sc.nextInt();
		
		System.out.println(n+"th Lergest Element is : "+nThLargest(arr, n));
		
		sc.close();
	}
	
	public static int nThLargest(int []arr, int n) {
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					count++;
				}
			}
			if(count+1 == n) {
				return arr[i];
			}
		}
		
		return 0;
	}
}
