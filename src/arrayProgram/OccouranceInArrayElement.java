package arrayProgram;

import java.util.Scanner;

public class OccouranceInArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of targate: ");
		int targate = sc.nextInt();
		
		System.out.println("Number of tergate in array is : "+countTergate(arr, targate));
		sc.close();
	}
	
	public static int countTergate(int arr[], int targate) {
		int count=0;
		for(int n: arr) {
			if(n==targate) {
				count++;
			}
		}
		return count;
	}
}
