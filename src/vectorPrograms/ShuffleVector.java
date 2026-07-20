package vectorPrograms;

import java.util.Collections;
import java.util.Vector;

public class ShuffleVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5); v.add(15); v.add(8); v.add(4); v.add(69); 
		v.add(45); v.add(78); v.add(21); v.add(39); v.add(55);
		
		System.out.println("Before shuffle : "+v);
		
		Collections.shuffle(v);
		
		System.out.println("After Shuffle : "+v);
	}
}
