package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class RotateLinkListByKthPosition {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(
				Arrays.asList(2,5,4,6,9,8,7,5));
		
		int k = 2;
		
		for(int i=1; i<=k; i++) {
			int lastElement = list.removeLast();
			
			list.addFirst(lastElement);
		}
		
		System.out.println(list);
	}
}
