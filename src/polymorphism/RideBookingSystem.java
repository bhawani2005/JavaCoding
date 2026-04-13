package polymorphism;

public class RideBookingSystem {
	public static void main(String[] args) {
		BikeRide r = new BikeRide(10);
		System.out.println("Bike Ride Fee: "+r.calculateFare());
		System.out.println("Bike Ride Fee with surge Multiplier: "+r.calculateFare(1.5));

	}
}

class Ride{
	
	protected double distance;
	
	public Ride(double distance) {
		this.distance = distance;
	}
	
	public double calculateFare() {
		return 0.0;
	}
}

class BikeRide extends Ride{

	public BikeRide(double distance) {
		super(distance);
	}
	
	public double calculateFare() {
		return 5*distance;
	}
	
	public double calculateFare(double surgeMultiplier) {
		return (5*distance)*surgeMultiplier;
	}
}

class AutoRide extends Ride{

	public AutoRide(double distance) {
		super(distance);
	}
	
	public double calculateFare() {
		return 10*distance;
	}
	
	public double calculateFare(double surgeMultiplier) {
		return (10*distance)*surgeMultiplier;
	}
}

class CabRide extends Ride{

	public CabRide(double distance) {
		super(distance);
	}
	
	public double calculateFare() {
		return (15*distance)+50;
	}
	
	public double calculateFare(double surgeMultiplier) {
		return ((15*distance)+50)*surgeMultiplier;
	}
}