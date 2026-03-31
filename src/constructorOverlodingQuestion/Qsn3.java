package constructorOverlodingQuestion;


public class Qsn3 {
	public static void main(String[] args) {
		MovieTicket mt1 = new MovieTicket("Dhurander", 201, 450, 5);
		mt1.displayTicket();
		
		MovieTicket mt2 = new MovieTicket("Sanam Tari Kasam", 305, 350, 2, 20);
		mt2.displayTicket();
	}
}

class MovieTicket{
	String movieName;
	int seatNumber;
	double ticketPrice;
	int numberOfTicket;
	double discount;
	
	MovieTicket(String movieName, int seatNumber, double ticketPrice, int numberOfTicket){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.ticketPrice = ticketPrice;
		this.numberOfTicket = numberOfTicket;
		calculateDiscount();
	}
	
	MovieTicket(String movieName, int seatNumber, double ticketPrice, int numberOfTicket, double discount){
		this(movieName, seatNumber, ticketPrice, numberOfTicket);
		this.discount = discount;
	}
	
	public void calculateDiscount() {
		if(discount==0.0) {
			if(numberOfTicket>5) {
				discount=15;
			}
			else if(numberOfTicket>2) {
				discount=10;
			}
			else {
				discount=5;
			}
		}
	}
	
	public void calculateTotalAmmount() {
		System.out.println("Total Amount: "+((ticketPrice*numberOfTicket)-((ticketPrice*numberOfTicket)*(discount/100))));
	}
	
	public void displayTicket() {
		System.out.println("Movie name: "+movieName);
		System.out.println("Seat number: "+seatNumber);
		System.out.println("Ticket Price: "+ticketPrice);
		System.out.println("Number of Ticket: "+numberOfTicket);
		System.out.println("Discount: "+discount);
		calculateTotalAmmount();
	}
}