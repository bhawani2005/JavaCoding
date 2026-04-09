package classTypeCasting;

public class MainClass {
	public static void main(String[] args) {
		
	}
}

class Payment{
	
}

class CardPayment extends Payment{
	void pay() {
		System.out.println("Payment done using card");
	}
	
	void enterPin() {
		System.out.println("PIN Varified for card");
	}
}

class UPIPayment extends Payment{
	void pay() {
		System.out.println("Payment done using UPI");
	}
	
	void ScanQRCode() {
		System.out.println("QR Code scanned");
	}
}

class CashPayment extends Payment{
	void pay() {
		System.out.println("Payment done using Cash");
	}
	
	void countCash() {
		System.out.println("Cash counted successfully");
	}
}

class NetBankingPayment extends Payment{
	void pay() {
		System.out.println("Payment done using Net Banking");
	}
	
	void loginBank() {
		System.out.println("Logged into bank account");
	}
}

class PaymentProcessor{
	void processPayment(Payment p) {
		
	}
}











