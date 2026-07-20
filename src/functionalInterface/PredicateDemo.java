package functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = a->(a%2 == 0);
		System.out.println(p.test(23));
		System.out.println(p.test(40));
	}
}
