package interface_code;


public class OnlinePaymentSystem {
	public static void main(String[] args) {
		CraditCard c = new CraditCard();
		c.checkBalance();
		c.generateOTP();
		c.pay();
		
		DebitCard d = new DebitCard();
		d.checkBalance();
		d.generateOTP();
		d.pay();
		
		UPI u = new UPI();
		u.checkBalance();
		u.pay();
	}
}

interface Payment{
	void pay();
	void checkBalance();
}

interface GenerateOtp{
	void generateOTP();
}

class CraditCard implements Payment, GenerateOtp{
	public void pay() {
		System.out.println("Payment done Cradit Card");
	}
	
	public void checkBalance() {
		System.out.println("Balance : 0000");
	}
	
	public void generateOTP() {
		System.out.println("OTP Generated for Credit card transation....");
	}
}

class DebitCard implements Payment, GenerateOtp{
	public void pay() {
		System.out.println("Payment done by Debit Card");
	}
	
	public void checkBalance() {
		System.out.println("Balance : 0000");
	}
	
	public void generateOTP() {
		System.out.println("OTP Generated for Dabit card transation....");
	}
}

class UPI implements Payment{
	public void pay() {
		System.out.println("Payment done by UPI...");
	}
	
	public void checkBalance() {
		System.out.println("Balance : 0000");
	}
}
