package constructor;

public class CourierServiceMain {
	public static void main(String[] args) {
		CourierService cs1 = new CourierService("Bhawani Shankar", "Denish kumar", 20);
		cs1.displayCourierDetails();
		
		System.out.println("-----------------------------------------------------------------");
		
		CourierService cs2 = new CourierService("Bhawani Shankar", "Denish kumar", 20, 22.2, 200);
		cs2.displayCourierDetails();
	}
}


class CourierService{
	String senderName;
	String receiverName;
	double weight;
	double distance;
	double courierCharge;
	
	CourierService(String senderName, String receiverName, double weight){
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.weight = weight;
		calculateCharge();
	}
	
	CourierService(String senderName, String receiverName, double weight, double distance, double courierCharge){
		this(senderName, receiverName, weight);
		this.distance = distance;
		this.courierCharge = courierCharge;
		calculateCharge();
	}
	
	public void calculateCharge() {
		courierCharge = 50+(weight*10)+(distance*5);
	}
	
	public void displayCourierDetails() {
		System.out.println("Sender name: "+senderName);
		System.out.println("Receiver Name: "+receiverName);
		System.out.println("Weight: "+weight);
		System.out.println("Distance: "+distance);
		System.out.println("Courier Charge: "+courierCharge);
	}
}