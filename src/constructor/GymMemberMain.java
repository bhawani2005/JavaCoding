package constructor;

public class GymMemberMain {
	public static void main(String[] args) {
		GymMember gm1 = new GymMember("Bhawani Shankar", 101, 4000);
		gm1.displayMemberDetails();
		
		System.out.println("------------------------------------------");
		
		GymMember gm2 = new GymMember("Sudip Maity", 102, 5200, 12, 45214);
		gm2.displayMemberDetails();
	}
}


class GymMember{
	String memberName;
	int memberId;
	double monthlyFee;
	int numberOfMonth;
	double totalFee;
	
	GymMember(String memberName, int memberId, double monthlyFee){
		this.memberName = memberName;
		this.memberId = memberId;
		this.monthlyFee = monthlyFee;
		calculateFee();
	}
	
	GymMember(String memberName, int memberId, double monthlyFee, int numberOfMonth, double totalFee){
		this(memberName, memberId, monthlyFee);
		this.numberOfMonth = numberOfMonth;
		calculateFee();
	}
	
	public void calculateFee() {
		totalFee = monthlyFee*numberOfMonth;
		if(numberOfMonth>=12) {
			totalFee = totalFee-(totalFee*0.2);
		}
		if(numberOfMonth>=6) {
			totalFee = totalFee-(totalFee*0.1);
		}
	}
	
	public void displayMemberDetails() {
		System.out.println("Member Name: "+memberName);
		System.out.println("Member Id: "+memberId);
		System.out.println("Monthly Fee: "+monthlyFee);
		System.out.println("Number of Months: "+numberOfMonth);
		System.out.println("Total Fee: "+totalFee);
	}
}