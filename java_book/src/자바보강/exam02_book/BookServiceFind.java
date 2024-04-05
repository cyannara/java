package 자바보강.exam02_book;

import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService {

	public BookServiceFind() {}
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void execute(BookList books) {
		System.out.print("검색할 이름>");
		String content = scanner.next();
		
		List<Book> list = books.findName(content); 
	
		for(Book l : list) {
			System.out.println(l);
		}
		
		
	}

}
