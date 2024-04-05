package 자바보강.exam02_book;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess  {
	
	ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public void insert(Book friend) {
		books.add(friend);
	}

	@Override
	public List<Book> findName(String name) {
		List<Book> list = new ArrayList<Book>(); 
		for (Book b : books) {
			if(b.getName().contains(name)) {
				list.add(b); 
			}
		}
		return list; 
	}

}
