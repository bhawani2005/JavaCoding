package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllEvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)%2 == 0) {
				list.remove(list.remove(i));
			}
		}
		
		System.out.println(list);
	}
}
