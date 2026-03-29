package classAndObject;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println("Product Name   Quantity   Price    Total Price");
		p1.productName="Shop";
		p1.price=25;
		p1.quantity=5;
		p1.displayBill();
	}
}

class Product{
	String productName;
	double price;
	int quantity;
	
	public double calculateBill() {
		return price*quantity;
	}
	
	public void displayBill() {
		System.out.println(productName+"               "+quantity+"       "+price+"        "+calculateBill());
	}
}