package lamdaExpression;

public class LamdaDemo {
	public static void main(String[] args) {
		Calculator c = (a, b) -> {
			System.out.println("Sum is : "+(a+b));
		};
		c.add(2, 5);
	}
}


interface Calculator{
	void add(int a, int b);
}
