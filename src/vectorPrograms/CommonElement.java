package vectorPrograms;

import java.util.Vector;

public class CommonElement {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		Vector<String> v2 = new Vector<String>();
		
		v1.add("apple"); v1.add("banana"); v1.add("cherry"); v1.add("apple");
		v2.add("banana"); v2.add("date"); v2.add("apple"); v2.add("elderberry");
		
		Vector<String> v3 = new Vector<String>();
		for(String a : v1) {
			if(!v3.contains(a)) {
				v3.add(a);
			}
		}
		
		v3.retainAll(v2);
		System.out.println(v3);

	}
}
