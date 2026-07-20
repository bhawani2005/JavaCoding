package arrayListProgram;

import java.util.ArrayList;

public class CoreQsn02 {
	public static void main(String[] args) {
		BookInventory b = new BookInventory();
		
		b.addBook(new Book(501, "Root cause", "James", 599.99));
		b.addBook(new Book(502, "Spend less save more", "Lakshman", 125.0));
		b.addBook(new Book(503, "Investing World", "James", 249.99));
		b.addBook(new Book(504, "Where am I", "Gurunanak", 350.00));
		
		b.printAllBooks();
		System.out.println("========================================================================================================");
		
		ArrayList<Book> temp = b.findBookByAuthor("James");
		System.out.println("Book written by james are : ");
		System.out.println(temp);
		
		System.out.println("========================================================================================================");

		b.removeBook(503);
		b.printAllBooks();
		
		System.out.println("========================================================================================================");
		
		System.out.println("Most Expensive Book is : ");
		System.out.println(b.findMostExpensiveBook());
		
		System.out.println("========================================================================================================");
		
		System.out.println("Total value of books in Library is : "+b.claculateTotalValue());

	}
}

class BookInventory{
	public ArrayList<Book> library = new ArrayList<>();
	
	public void addBook(Book book) {
		library.add(book);
	}
	
	public void removeBook(int bookId) {
		for(Book b : library) {
			if(b.bookId == bookId) {
				System.out.println("Book with the id: "+b.bookId+" is removed from library.");
				library.remove(b);
				break;
			}
		}
	}
	
	public ArrayList<Book> findBookByAuthor(String author){
		ArrayList<Book> books = new ArrayList<Book>();
		
		for(Book b : library) {
			if(b.author.equals(author)) {
				books.add(b);
			}
		}
		
		return books;
	}
	
	public Book findMostExpensiveBook() {
		Book expensiveBook = null;
		double maxPrice = Double.MIN_VALUE;
		
		for(Book b : library) {
			if(maxPrice<b.price) {
				maxPrice = b.price;
				expensiveBook = b;
			}
		}
		
		return expensiveBook;
	}
	
	public double claculateTotalValue() {
		double total = 0.0;
		
		for(Book b : library) {
			total += b.price;
		}
		
		return total;
	}
	
	public void printAllBooks() {
		for(Book b : library) {
			System.out.println(b);
		}
	}
}

class Book{
	public int bookId;
	public String title;
	public String author;
	public double price;
	
	public Book(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}