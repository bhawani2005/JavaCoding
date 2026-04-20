package tightCouplingAndLoseCoupling;

public class TightLooseCoupling {
	public static void main(String[] args) {
		Shopping s = new Shopping();
		s.checkOut();
	}
}

class DebitCard{
	public void pay() {
		System.out.println("Payment one using Debit Card...");
	}
}

class UPI{
	public void pay() {
		System.out.println("Payment one using UPI...");
	}
}

class Shopping{
	
	DebitCard d = new DebitCard();
	public void checkOut() {
		d.pay();
	}
}