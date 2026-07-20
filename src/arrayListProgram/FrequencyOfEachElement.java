package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
		
		
		for(int i=0; i<list.size(); i++) {
			int count = 0;
			if(!(list.subList(0, i).contains(list.get(i)))) {
				for(int j=i; j<list.size(); j++) {
					if(list.get(i).equals(list.get(j))) {
						count++;
					}
				}
				System.out.println(list.get(i)+" is present "+count+" times");
			}
		}
	}
}
