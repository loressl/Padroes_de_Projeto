package Iterator.opencodez.classes;

import java.util.ArrayList;
import java.util.List;

import Iterator.opencodez.interfaces.BookIterator;
import Iterator.opencodez.interfaces.IAgregado;
import Iterator.opencodez.iterator.BookIteratorImpl;

public class BookService implements IAgregado{
	
	public BookService() {
		this.books = new ArrayList<Book>();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBooks(Book book) {
		this.books.add(book);
	}
	
	private List<Book> books;

	@Override
	public BookIterator createIterator(String publication) {
		return new BookIteratorImpl(publication, books);
	}
}
