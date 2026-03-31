package constructorOverlodingQuestion;


public class Qsn5 {
	public static void main(String[] args) {
		MobileRecharge mr1 = new MobileRecharge(729295575, "Bhawani Shankar", 899, 90);
		mr1.displayRechargeDetails();
		
		MobileRecharge mr2 = new MobileRecharge(12546378, "Rahul kumar", 299, 28, 100);
		mr2.displayRechargeDetails();
	}
}

class MobileRecharge{
	long mobileNumber;
	String operatorName;
	double rechargeAmount;
	int validityDays;
	double cashback;
	public MobileRecharge(long mobileNumber, String operatorName, double rechargeAmount, int validityDays) {
		this.mobileNumber = mobileNumber;
		this.operatorName = operatorName;
		this.rechargeAmount = rechargeAmount;
		this.validityDays = validityDays;
		calculateCashback();
	}
	
	public MobileRecharge(long mobileNumber, String operatorName, double rechargeAmount, int validityDays,
			double cashback) {
		this(mobileNumber, operatorName, rechargeAmount, validityDays);
		this.cashback = cashback;
	}
	
	public void calculateCashback() {
		if(cashback==0.0) {
			if(rechargeAmount>500) {
				cashback=100;
			}
			else if(rechargeAmount>200) {
				cashback=50;
			}
			else {
				cashback=10;
			}
		}
	}
	
	public void calculateFinalAmount() {
		System.out.println("Final Amount: "+(rechargeAmount-cashback));
	}
	
	public void displayRechargeDetails(){
		System.out.println("Mobile Number: "+mobileNumber);
		System.out.println("Operator Name: "+operatorName);
		System.out.println("Recharge Amount: "+rechargeAmount);
		System.out.println("Validity Days: "+validityDays);
		System.out.println("Cashback: "+cashback);
		calculateFinalAmount();
		
	}
	
	
	
}