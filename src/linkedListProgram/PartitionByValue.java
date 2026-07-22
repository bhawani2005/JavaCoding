package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class PartitionByValue {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(
				Arrays.asList(2,4,5,9,3,1,7));
		
		LinkedList<Integer> before = new LinkedList<Integer>();
		LinkedList<Integer> after = new LinkedList<Integer>();
		
		int val = 5;
		
		for(Integer n : list) {
			if(n<val) {
				before.add(n);
			}
			else {
				after.add(n);
			}
		}
		
		list.clear();
		list.addAll(before);
		list.addAll(after);
		
		System.out.println(list);
		
	}
}
