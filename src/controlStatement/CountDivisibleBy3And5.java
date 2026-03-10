package controlStatement;

public class CountDivisibleBy3And5 {
	public static void main(String []args) {
		int count = 0;
		for(int i=0; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				count++;
			}
		}
		System.out.println("Total Number count who Divisible by both 3 and 5 is : "+count);
	}
}
