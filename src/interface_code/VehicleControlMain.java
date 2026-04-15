package interface_code;

public class VehicleControlMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.stop();
		
		Bike b = new Bike();
		b.start();
		b.stop();
		
		ElectricCar ev = new ElectricCar();
		ev.start();
		ev.chargeBattery();
		ev.stop();
	}
}


interface Vehicle{
	void start();
	void stop();
}

interface ElectricVehicle{
	void chargeBattery();
}

class Car implements Vehicle{
	public void start() {
		System.out.println("Car start....");
	}
	
	public void stop() {
		System.out.println("Car Stop....");
	}
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike start....");
	}
	
	public void stop() {
		System.out.println("Bike Stop....");
	}
}

class ElectricCar implements Vehicle, ElectricVehicle{
	public void start() {
		System.out.println("Electric Car start....");
	}
	
	public void chargeBattery() {
		System.out.println("Electric Car has charged...");
	}
	
	public void stop() {
		System.out.println("Electric Car Stop....");
	}
}