package arrayListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
				List.of(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5)
			);
		Object[] a = list.toArray();
		
		System.out.println(Arrays.toString(a));
	}
}
