package patterns.behavioral.Iterator;

public class BookShelfIterator implements MyIterator {
	private BookShelf bookshelf;
	private int index;

	public BookShelfIterator(BookShelf bs) {
		this.bookshelf = bs;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < bookshelf.getBooks().size();
	}

	@Override
	public String next() {
		if (hasNext()) {
			return bookshelf.getBooks().get(index++);
		}
		return null;
	}
}
