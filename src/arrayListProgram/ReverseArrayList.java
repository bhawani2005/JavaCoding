package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
				List.of(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5)
			);
		
		int left = 0; 
		int right = list.size()-1;
		
		while(left<right) {
			Integer temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			
			right--;
			left++;
		}
		
		System.out.println(list);
	}
}
