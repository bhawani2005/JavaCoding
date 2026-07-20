package functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Integer> sup = () -> (int)(Math.random()*100);
		System.out.println(sup.get());
	}
}
