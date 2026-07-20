package functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<Integer> op = a -> a*2;
		System.out.println(op.apply(50));
		
		
		UnaryOperator<String> op1 = a -> a.toUpperCase();
		System.out.println(op1.apply("Hello"));
	}
}
