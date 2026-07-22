package linkedListProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CheckPalindrome {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>(Arrays.asList("R","O","T","O","R"));
		
		LinkedList<String> temp = new LinkedList<String>(l);
		
		Collections.reverse(temp);
		
		if(l.equals(temp)) {
			System.out.println("Palindrom.");
		}
		else {
			System.out.println("Not Palindrom.");
		}
	}
}
