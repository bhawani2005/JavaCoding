package typeOfClass;

public class InnerClassDemo {
	public static void main(String[] args) {
		
	}
}

class Car{
	
	private String s = "Hello";
	class Engine{
		double torque;
		double hoursePower;
		
		public Engine(double torque, double hoursePower) {
			this.torque = torque;
			this.hoursePower = hoursePower;
		}	
		
		void run() {
			System.out.println(s);
		}
	}
	
	Engine engine;
	String brand;
	String color;
	
	public Car(Engine engine, String brand, String color) {
		this.engine = engine;
		this.brand = brand;
		this.color = color;
	}
	
	
}