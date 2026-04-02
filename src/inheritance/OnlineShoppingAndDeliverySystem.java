package inheritance;


public class OnlineShoppingAndDeliverySystem {
	public static void main(String[] args) {
		
	}
}


//User Section

class User{
	String name;
	int id;
	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	
	public void login() {
		System.out.println("Logged In..");
	}
	
	public void logout() {
		System.out.println("Logged Out..");
	}
}

//Customer section

class Coustomer extends User{
	
	String address;

	public Coustomer(String name, int id, String address) {
		super(name, id);
		this.address = address;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Address: "+address);
	}
	
	public void login() {
		System.out.println("Coustomer Logged In..");
	}
	
	public void logout() {
		System.out.println("Coustomer Logged Out..");
	}
}

class PrimeCoustomer extends Coustomer{
	String membershipType;
	String membershipFee;
	
	public PrimeCoustomer(String name, int id, String address, String membershipType, String membershipFee) {
		super(name, id, address);
		this.membershipType = membershipType;
		this.membershipFee = membershipFee;
	}
	
	public void displayPrimeDetails() {
		System.out.println("Membership Type: "+membershipType);
		System.out.println("Membership Fee: "+membershipFee);
	}
	
	public void calculateDiscount(double amount) {
		double discount  = amount*(10/100);
		double finalAmount = amount - discount;
		System.out.println("Final Amount: "+finalAmount);
	}
	
}

//Seller Section

class Seller extends User{
	String shopName;

	public Seller(String name, int id, String shopName) {
		super(name, id);
		this.shopName = shopName;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Shop Name: "+shopName);
	}
	
	public void login() {
		System.out.println("Seller Logged In..");
	}
	
	public void logout() {
		System.out.println("Seller Logged Out..");
	}
	
	public void addProduct() {
		System.out.println("Product added by Seller...");
	}
}

//Delivery Partner Section

class DeliveryPartner extends User{
	String vehicleType;

	public DeliveryPartner(String name, int id, String vehicleType) {
		super(name, id);
		this.vehicleType = vehicleType;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle Type: "+vehicleType);
	}
	
	public void login() {
		System.out.println("Delivery Partner Logged In..");
	}
	
	public void logout() {
		System.out.println("Delivery Partner Logged Out..");
	}
	
	public void deliverOrder() {
		System.out.println("Order Delivered...");
	}
}


//product section

class Products{
	String productName;
	double price;
	int quantity;
	
	public Products(String productName, double price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void displayProduct() {
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
	
	public void calculateTotal() {
		System.out.println("Total price: "+(price*quantity));
	}
}

class DiscountProducts extends Products{
	
	double discount;

	public DiscountProducts(String productName, double price, int quantity, double discount) {
		super(productName, price, quantity);
		this.discount = discount;
	}
	
	public void calculateFinalPrice() {
		double total = price*quantity;
		double finalAmount = total-(total*(discount/100));
		System.out.println("Final Amount: "+finalAmount);
	}
}

class ElectronicsProduct extends Products{
	
	int warranty;

	public ElectronicsProduct(String productName, double price, int quantity, int warranty) {
		super(productName, price, quantity);
		this.warranty = warranty;
	}
	
	public void displayWarranty() {
		System.out.println("Warranty: "+warranty);
	}
}


//Order Section

class Order{
	int orderId;
	int amount;
	
	public Order(int orderId, int amount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public void displayOrder() {
		System.out.println("Order Id: "+orderId);
		System.out.println("Amount: "+amount);
	}	
}


class OnlineOrder extends Order{
	double deliveryCharge;

	public OnlineOrder(int orderId, int amount, double deliveryCharge) {
		super(orderId, amount);
		this.deliveryCharge = deliveryCharge;
	}
	
	public void calculateFinalAmount() {
		double finalAmount = amount+deliveryCharge;
		System.out.println("Final Amount: "+finalAmount);	
	}
}

class InternationalOrder extends OnlineOrder{
	
	double customsCharge;

	public InternationalOrder(int orderId, int amount, double deliveryCharge, double customsCharge) {
		super(orderId, amount, deliveryCharge);
		this.customsCharge = customsCharge;
	}
	
	public void calculateFinalAmount() {
		double finalAmount = amount+deliveryCharge+customsCharge;
		System.out.println("Final Amount: "+finalAmount);	
	}
}









