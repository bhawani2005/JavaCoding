package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>(
				Arrays.asList(1,3,5,7,9));
		LinkedList<Integer> l2 = new LinkedList<Integer>(
				Arrays.asList(2,4,6,8));
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		int x = 0;
		int y = 0;
		
		while(x<l1.size() && y<l2.size()) {
			if(l1.get(x)<l2.get(y)) {
				result.add(l1.get(x));
				x++;
			}
			else {
				result.add(l2.get(y));
				y++;
			}
		}
		
		if(x < l1.size()) {
			result.addAll(l1.subList(x, l1.size()));
		}
		
		if(y < l2.size()) {
			result.addAll(l2.subList(y, l2.size()));
		}

		System.out.println(result);
	}
}
