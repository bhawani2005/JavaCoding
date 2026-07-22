package linkedListProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseALinkedList {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>(
				Arrays.asList("BOB", "TOB", "JOB", "POB", "DOB", "KOB"));
		
		int i=0;
		int j=l.size()-1;
		
		while(i<j) {
			String temp = l.get(i);
			l.set(i, l.get(j));
			l.set(j, temp);
			
			i++;
			j--;
		}
		
		System.out.println(l);
	}
}
