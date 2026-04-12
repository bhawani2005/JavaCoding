package logicalDesignPatternsInOpps_has_a_relation;

import java.util.ArrayList;
import java.util.List;

public class E_CommerceAndPaymentSystem {
	public static void main(String[] args) {
		Customer1 c = new Customer1("Ravin", "Shop", 25, 5);
		
		Product p = new Product("Shop", 5);
		
		List<Customer1> customers = new ArrayList<>();
		customers.add(c);
		
		List<Product> products = new ArrayList<>();
		products.add(p);
		
		Store s = new Store(customers, products);
		
		PaymentGateway pg = new PaymentGateway();
		pg.pay(c);
	}
}

class Order{
	public String productName;
	public double price;
	public int quantity;
	
	public Order(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double calculateBill() {
		return price*quantity;
	}
}

class Customer1{
	
	public String name;
	public Order order;
	
	public Customer1(String name, String productName, double price, int quantity) {
		this.name = name;
		this.order = new Order(productName, price, quantity);
	}
	
	public Order getOrder() {
		return order;
	}
}

class Product{
	public String name;
	public double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class Store{
	List<Customer1> customers;
	List<Product> products;
	
	public Store(List<Customer1> customers, List<Product> products) {
		this.customers = customers;
		this.products = products;
		
	}
}

class PaymentGateway{
	Store store;
	
	public void pay(Customer1 c) {
		System.out.println("Processing Payment...");
		System.out.println("Total Bill: "+c.getOrder().calculateBill());
	}
}