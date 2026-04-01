package inheritance;

public class VahicalMain {
	public static void main(String[] args) {
		LuxuryCar lc1 = new LuxuryCar("BMW G6", "Petrol", 10000, 2500);
		lc1.calculateFinalRent(5);
	}
}

class Vehicle{
	public String vehicalName;
	public String fuelType;
	
	public Vehicle(String vehicalName, String fuelType) {
		this.vehicalName = vehicalName;
		this.fuelType = fuelType;
	}
	
	public void displayDetails() {
		System.out.println("Vehical Name: "+vehicalName);
		System.out.println("Fuel Type: "+fuelType);
	}
}

class Car extends Vehicle{
	double rentPerDay;

	public Car(String vehicalName, String fuelType, double rentPerDay) {
		super(vehicalName, fuelType);
		this.rentPerDay = rentPerDay;
	}
	
	public double calculateRent(int days) {
		return days*rentPerDay;
	}
}

class LuxuryCar extends Car{
	double luxuryCharge;

	public LuxuryCar(String vehicalName, String fuelType, double rentPerDay,double luxuryCharge) {
		super(vehicalName, fuelType, rentPerDay);
		this.luxuryCharge = luxuryCharge;
	}
	
	public void calculateFinalRent(int days) {
		System.out.println("Rent: "+calculateRent(days));
		System.out.println("Final Rent: "+(calculateRent(days)+luxuryCharge));
	}
	
}