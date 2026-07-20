package vectorPrograms;

import java.util.Vector;

public class MergeAndRemoveDuplicate {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		
		v1.add(1); v1.add(2); v1.add(3); v1.add(2);
		v2.add(3); v2.add(4); v2.add(2); v2.add(5);
		
		Vector<Integer> v3 = new Vector<Integer>();
		
		for(Integer a : v1) {
			if(!v3.contains(a)) {
				v3.add(a);
			}
		}
		
		for(Integer a : v2) {
			if(!v3.contains(a)) {
				v3.add(a);
			}
		}
		
		System.out.println(v3);
	}
}
