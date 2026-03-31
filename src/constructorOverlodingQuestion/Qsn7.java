package constructorOverlodingQuestion;


public class Qsn7 {
	public static void main(String[] args) {
		ElectricityBill eb1 = new ElectricityBill("Rahul", "KAI56", 752, 10.25);
		eb1.displayBill();
		
		ElectricityBill eb2 = new ElectricityBill("Kunal", "HYD23", 125, 7.56, 5);
		eb2.displayBill();
	}
}

class ElectricityBill{
	String customerName;
	String meterNumber;
	double unitConsumed;
	double costPerUnit;
	double surcharge;
	
	public ElectricityBill(String customerName, String meterNumber, double unitConsumed, double costPerUnit) {
		this.customerName = customerName;
		this.meterNumber = meterNumber;
		this.unitConsumed = unitConsumed;
		this.costPerUnit = costPerUnit;
		calculateSurcharge();
	}
	
	public ElectricityBill(String customerName, String meterNumber, double unitConsumed, double costPerUnit,
			double surcharge) {
		this(customerName, meterNumber, unitConsumed, costPerUnit);
		this.surcharge = surcharge;
	}
	
	public void calculateSurcharge() {
		if(surcharge==0) {
			if(unitConsumed>500) surcharge=20;
			else if(unitConsumed>200) surcharge=10;
			else surcharge=5;
		}
	}
	
	public void calculateBill() {
		System.out.println("Total Bill: "+((unitConsumed*costPerUnit)+((unitConsumed*costPerUnit)*(surcharge/100))));
	}
	
	public void displayBill() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Meter Number: "+meterNumber);
		System.out.println("Unit Consumed: "+unitConsumed);
		System.out.println("Cost Per Unit: "+costPerUnit);
		System.out.println("Surcharge: "+surcharge);
		calculateBill();
	}
	
	
}