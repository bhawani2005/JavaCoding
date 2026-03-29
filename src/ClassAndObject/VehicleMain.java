package ClassAndObject;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.vehicleName="Tata Punch";
		v1.fule=25;
		v1.refuel(20);
		v1.drive(11);
		v1.displayVehicleInfo();
	}
}

class Vehicle{
	String vehicleName;
	int fule;
	
	public void refuel(int amount) {
		fule+=amount;
		System.out.println("After refuel: "+fule);
	}
	
	public void drive(int amount) {
		if(amount>fule) {
			System.out.println("Not enough fuel..");
		}
		else {
			fule-=amount;
			System.out.println("After Drive: "+fule);
		}
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("Fule : "+fule);
	}
}