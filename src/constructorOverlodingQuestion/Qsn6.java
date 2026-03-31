package constructorOverlodingQuestion;

public class Qsn6 {
	public static void main(String[] args) {
		CabBooking cb1 = new CabBooking("Bhawani Shankar", "AC", 25, 12);
		cb1.displayBooking();
		
		CabBooking cb2 = new CabBooking("Ankit", "Non-Ac", 38, 11, 18);
		cb2.displayBooking();
	}
}

class CabBooking{
	String coustomerName;
	String cabType;
	double distance;
	double pricePerKm;
	double discount;
	
	public CabBooking(String coustomerName, String cabType, double distance, double pricePerKm) {
		this.coustomerName = coustomerName;
		this.cabType = cabType;
		this.distance = distance;
		this.pricePerKm = pricePerKm;
		calculateDiscount();
	}

	public CabBooking(String coustomerName, String cabType, double distance, double pricePerKm, double discount) {
		this(coustomerName, cabType, distance, pricePerKm);
		this.discount = discount;
	}
	
	public void calculateDiscount() {
		if(discount==0) {
			if(distance>20) {
				discount=20;
			}
			else if(distance>10) {
				discount=10;
			}
			else {
				discount=5;
			}
		}
	}
	
	public void calculateFare() {
		System.out.println("Total Fare: "+((distance*pricePerKm)-((distance*pricePerKm)*(discount/100))));
	}
	
	public void displayBooking() {
		System.out.println("Customer Name: "+coustomerName);
		System.out.println("Cab Type: "+cabType);
		System.out.println("Distance: "+distance);
		System.out.println("Price Per KM: "+pricePerKm);
		System.out.println("Discount: "+discount);
		calculateFare();
	}
	
	
}