package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(List.of("Alice", "Bob", "Charlie"));
		
		String target = "Bob";
		
		for(String a : list) {
			if(a.equals(target)) {
				System.out.println(target+" is Present in index number : "+list.indexOf(target));
				break;
			}
		}
	}
}
