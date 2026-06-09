package arrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectArrayExample {
	public static void main(String[] args) {
		 // Dynamically create an int array of length 5
		Object arr = Array.newInstance(int.class, 5);
		
		// Set value at index 0
		Array.setInt(arr, 0, 100);
		
		// Retrieve value at index 0
		int val = Array.getInt(arr, 0);
		System.out.println("Element at 0: "+val);
		
		// Get length
		System.out.println("Length: "+Array.getLength(arr));
		
		// Cast to int[] to use Arrays utility methods
		int[] casted = (int[]) arr;
		System.out.println("Full array: "+Arrays.toString(casted));
	}
}
