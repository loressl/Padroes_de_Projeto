package Iterator.opencodez;

import java.util.ArrayList;
import java.util.List;

import Iterator.opencodez.classes.Book;
import Iterator.opencodez.classes.BookService;
import Iterator.opencodez.interfaces.BookIterator;

//https://www.opencodez.com/java/iterator-design-pattern.htm

public class Cliente {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java", "Pub A"));
		books.add(new Book("C++", "Pub B"));
		books.add(new Book("PHP", "Pub A"));
		books.add(new Book("Kotlin", "Pub B"));
		books.add(new Book("Kafka", "Pub A"));
		books.add(new Book("Salesforce", "Pub C"));
		
		BookService bs = new BookService();
		bs.getBooks().addAll(books);
		
		System.out.println("List of Books from Publisher C");
		
		BookIterator bi = bs.createIterator("Pub C");
		while (bi.hasNext()) {
			Book b = (Book) bi.next();
			System.out.println("--> " + b);
		}
		
		System.out.println("\nList of Books from Publisher B");
		
		bi = bs.createIterator("Pub B");
		while (bi.hasNext()) {
			Book b = (Book) bi.next();
			System.out.println("--> " + b);
		}

	}

}
