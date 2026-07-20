package vectorPrograms;

import java.util.Vector;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("a"); v.add("b"); 
		v.add("a"); v.add("c"); 
		v.add("b"); v.add("d");
		
		Vector<String> unique = new Vector<String>();
		
		for(String a : v) {
			if(!unique.contains(a)) {
				unique.add(a);
			}
		}
		
		System.out.println(unique);
	}
}
