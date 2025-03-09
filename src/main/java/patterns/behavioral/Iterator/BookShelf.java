package patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private List<String> books = new ArrayList<>();

	public MyIterator createIterator() {
		return new BookShelfIterator(this);
	}

	public void addBook(String book) {
		books.add(book);
	}

	public List<String> getBooks() {
		return books;
	}

}
