package 자바보강.exam02_book;

import java.util.Scanner;

public class BookApp2 {
	public static void main(String[] args) {
		BookList books = new BookList();
		books.insert(new Book("1","자바","자바를 배우자"));
		books.insert(new Book("2","JSP","JSP 기초"));
		books.insert(new Book("3","JSP응용","JSP 심화학습"));
		books.insert(new Book("4","자바웹","JSP 응용"));
		BookService[] service = {null, new BookServiceInsert(), new BookServiceFind()};
		int menu =0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1.등록   2.내용조회    0.종료");
			System.out.print("입력>");
			menu = scanner.nextInt();
			if(menu==0) break;
			service[menu].execute(books);
		}while(true);
	}

}
