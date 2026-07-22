package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class Intersection {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>(
				Arrays.asList(1,5,3,2,4,6,8));
		LinkedList<Integer> list2 = new LinkedList<Integer>(
				Arrays.asList(5,8,4,9,7,2));
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		for(Integer n : list1) {
			if(list2.contains(n) && !result.contains(n)) {
				result.add(n);
			}
		}
		
		System.out.println(result);
	}
}
