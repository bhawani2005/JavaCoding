package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(
				List.of(1,2,3)
			);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(
				List.of(4,5,6)
			);
		
		list1.addAll(list2);
		System.out.println(list1);
	}
}
