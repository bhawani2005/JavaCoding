package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>(Arrays.asList(2,3,5,4,2,6,8,4,6,5));
		LinkedList<Integer> result = new LinkedList<Integer>();
		for(Integer n : l) {
			if(!result.contains(n)) {
				result.add(n);
			}
		}
		
		System.out.println(result);
	}
}
