package constructor;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product("gold", 101, 25000);
		p1.displayProduct();
		
		System.out.println("--------------------------------");
		
		Product p2 = new Product("Silver", 102, 3000, 2, 10);
		p2.displayProduct();
	}
}

class Product{
	String productName;
	int productId;
	double price;
	int quantity;
	int discount;
	
	Product(String productName, int productId, double price){
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}
	
	Product(String productName, int productId, double price, int quantity, int discount){
		this(productName, productId, price);
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public void calculateFinalPrice() {
		if(price>5000) {
			System.out.println("Final Price: "+(price-(price*0.2))*quantity);
		}
		else if(price>2000) {
			System.out.println("Final Price: "+(price-(price*0.1))*quantity);
		}
		else {
			System.out.println("Final Price: "+(price-(price*0.05))*quantity);
		}
	}
	
	public void displayProduct() {
		System.out.println("Product Name: "+productName);
		System.out.println("Product Id: "+productId);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Discount: "+discount);
		calculateFinalPrice();
	}
}
