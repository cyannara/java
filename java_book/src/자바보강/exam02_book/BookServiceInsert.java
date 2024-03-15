package exam02_book;

import java.util.Scanner;

public class BookServiceInsert  implements BookService{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void execute(BookList books) {
		System.out.print("ISBN>");
		String isbn = scanner.next();
		System.out.print("NAME>");
		String name = scanner.next();
		System.out.print("CONTENT>");
		String content = scanner.next();
		
		for (Book i : books.books) {
			if(i.getIsbn().equals(isbn)) {
				System.out.println("이미 등록된 ISBN입니다.");
				return;
			}
		}
		books.insert(new Book(isbn, name, content));
	}

}
