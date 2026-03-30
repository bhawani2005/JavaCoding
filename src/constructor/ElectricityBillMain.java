package constructor;


public class ElectricityBillMain {
	public static void main(String[] args) {
		ElectricityBill eb1 = new ElectricityBill("Bhawani Shankar Dhara", "KAI26", 369.25);
		eb1.displayBill();
		
		ElectricityBill eb2 = new ElectricityBill("Ankit Rathore", "KAU589", 100, 200, "commercial");
		eb2.displayBill();
	}
}


class ElectricityBill{
	String consumerName;
	String connectionId;
	double unitsConsumed;
	double billAmount;
	String connectionType="Domestic";
	
	ElectricityBill(String consumerName, String connectionId, double unitsConsumed){
		this.consumerName = consumerName;
		this.connectionId = connectionId;
		this.unitsConsumed = unitsConsumed;
		calculateBill();
	}
	
	ElectricityBill(String consumerName, String connectionId, double unitsConsumed, double billAmount, String connectionType){
		this(consumerName, connectionId, unitsConsumed);
		this.billAmount = billAmount;
		this.connectionType = connectionType;
		
	}
	
	public void calculateBill(){
		if(unitsConsumed<=100) {
			billAmount = unitsConsumed*2;
		}
		else if(unitsConsumed<=300) {
			billAmount = (100*2)+((unitsConsumed-100)*3);
		}
		else {
			billAmount = (100*2)+(200*3)+((unitsConsumed-300)*5);
		}
	}
	
	public void displayBill() {
		System.out.println("Consumer Name: "+consumerName);
		System.out.println("Connection Id: "+connectionId);
		System.out.println("Units Consumed: "+unitsConsumed);
		System.out.println("Bill Amount: "+billAmount);
		System.out.println("Connection Type: "+connectionType);
	}
}