package vectorPrograms;

import java.util.Vector;

public class AddTwoUnequaleSizeVectorInVector {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		v1.add(5); v1.add(15); v1.add(8); v1.add(4); v1.add(69); 
		v2.add(45); v2.add(78); v2.add(21); v2.add(39);
		
		Vector<Integer> v3 = new Vector<Integer>();
		int n = Math.min(v1.size(), v2.size());
		for(int i=0; i<n; i++) {
			v3.add(v1.get(i));
			v3.add(v2.get(i));
		}
		
		if(v1.size()>n) {
			v3.addAll(v1.subList(n, v1.size()));
		}
		
		if(v2.size()>n) {
			v3.addAll(v2.subList(n, v2.size()));
		}
		
		System.out.println(v3);
	}
}
