package ClassAndObject;


public class MobileMain {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand="MI";
		m1.price=20000;
		m1.batteryPercentage=60;
		m1.chargeBattery(12);
		m1.useMobile(16);
		m1.displayMobileInfo();
	}
}


class Mobile{
	public String brand;
	public double price;
	public int batteryPercentage;
	
	public void chargeBattery(int ammount) {
		batteryPercentage+=ammount;
	}
	
	public void useMobile(int ammount) {
		batteryPercentage-=ammount;
	}
	
	public void displayMobileInfo() {
		System.out.println("Brand name: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Buttery Percentage: "+batteryPercentage);
	}
}