package functionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, String> f = n -> "given number is "+n;
		System.out.println(f.apply(25));
		
		Function<String, String> fun = a->a.toUpperCase();
		System.out.println(fun.apply("Hello"));
		
		String[] a = {"Hello", "Hii", "Byee", "Get lost"};
		for(int i=0; i<a.length; i++) {
			a[i] = fun.apply(a[i]);
		}
		System.out.println(Arrays.toString(a));
		
		
		Function<Integer, Integer> fun1 = num -> num*num;
		System.out.println(fun1.apply(4));
	}
}
