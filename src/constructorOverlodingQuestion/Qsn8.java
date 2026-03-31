package constructorOverlodingQuestion;

public class Qsn8 {
	public static void main(String[] args) {
		GymMembership gm1 = new GymMembership("Souriya", 254, 500, 16);
		gm1.displayMembership();
		
		GymMembership gm2 = new GymMembership("Rohon", 365, 1200, 3, 18);
		gm2.displayMembership();
	}
}

class GymMembership{
	String memberName;
	int membershipId;
	double monthlyFee;
	int months;
	double discount;
	
	public GymMembership(String memberName, int membershipId, double monthlyFee, int months) {
		this.memberName = memberName;
		this.membershipId = membershipId;
		this.monthlyFee = monthlyFee;
		this.months = months;
		calculateDiscount();
	}

	public GymMembership(String memberName, int membershipId, double monthlyFee, int months, double discount) {
		this(memberName, membershipId, monthlyFee, months);
		this.discount = discount;
	}
	
	public void calculateDiscount() {
		if(discount==0) {
			if(months>=12) discount=25;
			else if(months>=6) discount=15;
			else discount=5;
		}
	}
	
	public void calculateTotalFee() {
		System.out.println("Total Fee:"+((monthlyFee*months)-((monthlyFee*months)*(discount/100))));
	}
	
	public void displayMembership() {
		System.out.println("Member Name: "+memberName);
		System.out.println("Membership Id: "+membershipId);
		System.out.println("Monthly Fee: "+monthlyFee);
		System.out.println("Months: "+months);
		System.out.println("Discount: "+discount);
		calculateTotalFee();
	}
}