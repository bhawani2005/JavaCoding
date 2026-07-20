package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
					List.of(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5)
				);
//		ArrayList<Integer> result = new ArrayList<Integer>();
//		for(Integer a : list) {
//			if(!result.contains(a)) {
//				result.add(a);
//			}
//		}
		
		for(int a : list) {
			if(list.indexOf(a) != list.lastIndexOf(a)) {
				list.remove(list.indexOf(a));
			}
		}
		
		System.out.println();
		
	}
}
