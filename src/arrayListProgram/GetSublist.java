package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class GetSublist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(
				List.of("a", "b", "c", "d", "e", "f")
			);
		
		int first = 2;
		int last = 5;
		
		System.out.println(list.subList(first, last+1));
	}
}
