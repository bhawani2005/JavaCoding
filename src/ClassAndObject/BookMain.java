package classAndObject;

public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Game of Thrones";
		b1.author = "George";
		b1.price = 599;
		b1.pages = 800;
		b1.showBookInfo();
		
		Book b2 = new Book();
		b2.title = "Ramayan";
		b2.author = "valmiki";
		b2.price = 5000;
		b2.pages = 1200;
		b2.showBookInfo();
	}
}

class Book{
	public String title;
	public String author;
	public double price;
	public int pages;
	
	public void showBookInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+pages);
		System.out.println("Pages: "+pages);
	}
}
