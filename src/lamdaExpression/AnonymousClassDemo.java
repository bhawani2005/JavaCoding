package lamdaExpression;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Calculator1 c = new Calculator1() {
			
			@Override
			public void add(int a, int b) {
				System.out.println("Sum is : "+(a+b));
				
			}

			@Override
			public void subtract(int a, int b) {
				System.out.println("Subtract is : "+(a-b));
			}
		};
		
		c.add(2, 5);
		c.subtract(5, 3);
	}
}


interface Calculator1{
	void add(int a, int b);
	void subtract(int a, int b);
}
