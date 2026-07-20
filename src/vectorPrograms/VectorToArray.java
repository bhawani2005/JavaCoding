package vectorPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorToArray {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5); v.add(15); v.add(8); v.add(4); v.add(69); 
		v.add(45); v.add(78); v.add(21); v.add(39); v.add(55);
		
		Integer []arr = new Integer[v.size()];
		v.copyInto(arr);
		
		System.out.println("Array Elements Are : "+Arrays.toString(arr));
		
		
		Vector<Integer> v2 = new Vector<Integer>();
		for(Integer a : arr) {
			v2.add(a);
		}
		
		Collections.sort(v2);
		System.out.println("After converting arr to vector And performming sorting : "+v2);
	}
}
