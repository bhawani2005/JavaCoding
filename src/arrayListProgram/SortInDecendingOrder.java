package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInDecendingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
				List.of(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5)
			);
		
//		Collections.sort(list);
//		Collections.reverse(list);
		
		for(int cycle = 0; cycle < list.size()-1; cycle++) {
			for(int i = 0; i<list.size()-1; i++) {
				if(list.get(i+1)>list.get(i)) {
					Integer temp = list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, temp);
				} 
			}
		}
		
		System.out.println(list);
	}
}
