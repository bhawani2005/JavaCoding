package functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> con = a -> System.out.println("Student name is : "+a);
		con.accept("Bhawani Shankar");
		
		Consumer<Integer> con1 = a -> System.out.println("Square : "+a*a);
		con1.accept(25);
	}
}
