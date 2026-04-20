package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class IntoToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Array Size : ");
		int size = sc.nextInt();
		
		int []array = new int[size];
		
		System.out.println("Enter Array Item: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Giver Array is : "+Arrays.toString(array));
		sc.close();
	}
}
