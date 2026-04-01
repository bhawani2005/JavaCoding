package inheritance;

public class ProductMain {
	public static void main(String[] args) {
		DiscountProduct dp1 = new DiscountProduct("Gold", 20000, 3, 20);
		dp1.displayDetails();
		dp1.calculateFinalAmount();
		
		DiscountProduct dp2 = new DiscountProduct("silver",2000 , 2);
		dp2.displayDetails();
		dp2.calculateFinalAmount();
	}
}

class Product{
	String productName;
	double price;
	int quantity;
	
	
	public Product(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayDetails() {
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
	
	public double calculateTotal() {
		return price*quantity;
	}
}

class DiscountProduct extends Product{
	double discount;
	
	public DiscountProduct(String productName, double price, int quantity) {
		super(productName, price, quantity);
	}

	
	public DiscountProduct(String productName, double price, int quantity, double discount) {
		super(productName, price, quantity);
		this.discount = discount;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Discount: "+discount);
	}
	public void calculateFinalAmount() {
		double total = super.calculateTotal();
		double finalAmount = total-(total*(discount/100));
		
		System.out.println("Total price: "+finalAmount);
	}
}