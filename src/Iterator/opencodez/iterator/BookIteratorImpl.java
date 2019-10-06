package Iterator.opencodez.iterator;

import java.util.List;

import Iterator.opencodez.classes.Book;
import Iterator.opencodez.interfaces.BookIterator;

public class BookIteratorImpl implements BookIterator{
	
	public BookIteratorImpl(String publicationCheck, List<Book> listOfBooks) {
		this.publicationCheck = publicationCheck;
		this.listOfBooks = listOfBooks;
	}

	@Override
	public boolean hasNext() {
		while(index < listOfBooks.size()) {
			Book buk = this.listOfBooks.get(index);
			if(buk.getPublication().equalsIgnoreCase(publicationCheck)) {
				return true;
			} else {
				index++;
			}
		}
		return false;
	}

	@Override
	public Object next() {
		Book buk = this.listOfBooks.get(index);
		index++;
		return buk;
	}

	private String publicationCheck;
	private List<Book> listOfBooks;
	private int index;
}
