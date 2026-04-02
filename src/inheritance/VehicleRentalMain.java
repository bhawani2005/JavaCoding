package inheritance;


public class VehicleRentalMain {
	public static void main(String[] args) {
		Cars c1 = new Cars("JH054673", 2500, 7);
		c1.displayDetails();
		c1.calculateRent();
		
		System.out.println("---------------------------------------");
		
		Bike b1 = new Bike("OD113490", 1000, 15);
		b1.displayDetails();
		b1.calculateRent();
		
		System.out.println("---------------------------------------");
		
		Bus bu1 = new Bus("AP233452", 12000, 3, 60);
		bu1.displayDetails();
		bu1.calculateRent();
	}
}

class VehicleRental{
	String vehicleNumber;
	double rentPerDay;
	int days;
	public VehicleRental(String vehicleNumber, double rentPerDay, int days) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.rentPerDay = rentPerDay;
		this.days = days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Rent Per Day: "+rentPerDay);
		System.out.println("Days: "+days);		
	}
	
	public void calculateRent() {
		System.out.println("Total Rent: "+(days*rentPerDay));
	}
}

class Cars extends VehicleRental{

	public Cars(String vehicleNumber, double rentPerDay, int days) {
		super(vehicleNumber, rentPerDay, days);
	}
	
}

class Bike extends VehicleRental{

	public Bike(String vehicleNumber, double rentPerDay, int days) {
		super(vehicleNumber, rentPerDay, days);
	}

}

class Bus extends VehicleRental{
	
	int seats;

	public Bus(String vehicleNumber, double rentPerDay, int days, int seats) {
		super(vehicleNumber, rentPerDay, days);
		this.seats = seats;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Seats: "+seats);
	}
}