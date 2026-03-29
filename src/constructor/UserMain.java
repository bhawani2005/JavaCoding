package constructor;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title, LastName, FirstName :");
		User ob = new User(sc.next(), sc.next(), sc.next());
		ob.printFullName();
		
		System.out.println("Enter Title, LastName, FirstName, Address : ");
		User ob2 = new User(sc.next(), sc.next(), sc.next(), sc.next());
		ob2.printFullName();
		
		sc.close();
	}
}


class User{
	
	String title;
	String lastName;
	String firstName;
	String address;
	
	public User(String title, String lastName, String firstName) {
		this.title = title;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public User (String title, String lastName, String firstName, String address) {
		this(title, lastName, firstName);
		this.address = address;
	}
	
	public void printFullName() {
		System.out.println(title+". "+firstName+" "+lastName);
	}
}