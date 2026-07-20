package vectorPrograms;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		//Declare vector according to generic.
	
		Vector v = new Vector();
		v.add(10);
		v.add("Hello");
		v.add(12.5);
		System.out.println(v);
		Vector<String> v1 = new Vector<String>();
		Vector<String> v2 = new Vector<>();
		Vector<String> v3 = new Vector();
		
		//Declare vector according to constructor.
		
		Vector<Integer> v4 = new Vector<Integer>();//by default it create 10 size of vector and if we add a value after size 10 the it will be auto incremented by double by its size.
		Vector<Integer> v5 = new Vector<Integer>(20);//it create 20 size of vector and if we add a value after size 20 it also incremented by double .
		Vector<Integer> v6 = new Vector<Integer>(55, 5);//it create 55 size of vector and it we add a value after 55 the it will have incremented by 5.
		List<String> list = List.of("A", "B", "C");
		Vector<String> v7 = new Vector<String>(list);
		
		
		
	}
}
