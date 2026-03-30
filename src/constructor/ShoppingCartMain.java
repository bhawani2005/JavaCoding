package constructor;

public class ShoppingCartMain {
	public static void main(String[] args) {
		ShoppingCart sc1 = new ShoppingCart("Gold", 201, 2000, 5);
		sc1.displayCartDetails();
		
		
		ShoppingCart sc2 = new ShoppingCart("silver", 205, 200, 8, 1600);
		sc2.displayCartDetails();
	}
}

class ShoppingCart{
	String itemName;
	int itemId;
	double price;
	int quantity;
	double totalAmount;
	
	ShoppingCart(String itemName, int itemId, double price, int quantity){
		this.itemName = itemName;
		this.itemId = itemId;
		this.price = price;
		this.quantity = quantity;
		calculateTotalAmount();
		discount();
	}
	
	ShoppingCart(String itemName, int itemId, double price, int quantity, double totalAmount){
		this(itemName, itemId, price, quantity);
		this.totalAmount = totalAmount;
		discount();
	}
	
	public void calculateTotalAmount() {
		totalAmount = price*quantity;
	}
	
	public void discount() {
		if(totalAmount>5000) {
			totalAmount = totalAmount-(totalAmount* 0.15);
		}
		if(totalAmount>2000) {
			totalAmount = totalAmount-(totalAmount* 0.10);
		}
	}
	
	public void displayCartDetails() {
		System.out.println("Item Name: "+itemName);
		System.out.println("Item Id: "+itemId);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total Amount: "+totalAmount);
	}
}