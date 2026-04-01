package inheritance;

public class ShoppingMain {
	public static void main(String[] args) {
		Electronics e1 = new Electronics("Fan", 1200, 5, 3);
		e1.displayDetails();
		e1.calculateTotal();
		
		System.out.println("-------------------------------------------");
		
		Clothing c1 = new Clothing("Shirt", 600, 5, "XL");
		c1.displayDetails();
		c1.calculateTotal();
		
		System.out.println("-------------------------------------------");
		
		Groceries g1 = new Groceries("Shop", 25, 10, "25/05/2026");
		g1.displayDetails();
		g1.calculateTotal();
	}
}

class Shopping{
	String productName;
	double price;
	int quantity;
	
	
	
	public Shopping(String productName, double price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayDetails() {
		System.out.println("Product name: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
	
	public void calculateTotal() {
		System.out.println("Total Price: "+(price*quantity));
	}
}

class Electronics extends Shopping{
	int warranty;

	public Electronics(String productName, double price, int quantity, int warranty) {
		super(productName, price, quantity);
		this.warranty = warranty;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Warranty: "+warranty);
	}
}

class Clothing extends Shopping{
	String size;

	public Clothing(String productName, double price, int quantity, String size) {
		super(productName, price, quantity);
		this.size = size;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size: "+size);
	}
}

class Groceries extends Shopping{
	String expiryDate;

	public Groceries(String productName, double price, int quantity, String expiryDate) {
		super(productName, price, quantity);
		this.expiryDate = expiryDate;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Expiry Date: "+expiryDate);
	}
}


