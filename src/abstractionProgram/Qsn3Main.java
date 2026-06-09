package abstractionProgram;

import java.util.Scanner;

public class Qsn3Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your choice: ");
		int ch = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Food Item: ");
		String item = sc.nextLine();
		
		DeliveryPartner dp = DeliveryFactory.getPartner(ch);
		
		OrderService os = new OrderService();
		os.placeOrder(dp, item);
		
		sc.close();
	}
}

interface DeliveryPartner{
	boolean deliverOrder(String item);
}

class SwiggyDelivery implements DeliveryPartner{
	public boolean deliverOrder(String item) {
		System.out.println("Order Delivered Via Swiggy.");
		return true;
	}
}

class ZomatoDelivery implements DeliveryPartner{
	public boolean deliverOrder(String item) {
		System.out.println("Order Delivered Via Zomato.");
		return true;
	}
}

class DunzoDelivery implements DeliveryPartner{
	public boolean deliverOrder(String item) {
		System.out.println("Order Delivered Via Dunzo.");
		return true;
	}
}


//===================================================================

class OrderService{
	public void placeOrder(DeliveryPartner partner, String item) {
		if(partner.deliverOrder(item)) {
			System.out.println("Order delivered Successfully \nEnjoy your meal!");
		}
		else {
			System.out.println("Delivery failed. Try again.");
		}
	}
}


//===================================================================


class DeliveryFactory{
	public static DeliveryPartner getPartner(int choice) {
		DeliveryPartner dp = null;
		if(choice == 1) {
			dp = new SwiggyDelivery();
		}
		else if(choice == 2) {
			dp = new ZomatoDelivery();
		}
		else if(choice == 3) {
			dp = new DunzoDelivery();
		}
		else {
			System.out.println("Invalid choice....");
			dp = null;
		}
		
		return dp;
	}
}