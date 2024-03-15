package middleTest;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookApp bookApp = new BookApp();
		bookApp.start();
	}

	Scanner scanner = new Scanner(System.in);
	BookStorage books = BookStorage.getInstance();

	public void start() {
		books.saveData(new Book("a1", "자바", "자바를 배우자"));
		books.saveData(new Book("b2", "JSP", "JSP 기초"));
		books.saveData(new Book("c3", "JSP응용", "JSP 심화학습"));
		books.saveData(new Book("d4", "자바웹", "JSP 응용"));

		int menu = 0;
		do {
			System.out.println("\n===== 1.도서등록  2.도서삭제  3.도서전체조회  4.종료=====\n");
			System.out.print("입력>");
			menu = Integer.parseInt(scanner.nextLine());
			scanner.reset();

			// 코드 작성
			switch (menu) {
			case MENU.INPUT:
				input();
				break;
			case MENU.DELETE:
				delete();
				break;
			case MENU.SEARCH:
				search();
				break;
			case MENU.EXIT:
				System.out.println("프로그램종료");
			}
		} while (menu != 4);
	}

	public void input() {
		String isbn;
		String name;
		String content;
		System.out.print("ISBN>");
		isbn = scanner.nextLine();
		scanner.reset();
		System.out.print("NAME>");
		name = scanner.nextLine();
		scanner.reset();
		System.out.print("CONTENT>");
		content = scanner.nextLine();
		scanner.reset();
		if (books.saveData(new Book(isbn, name, content)))
			System.out.println("등록완료");
		else
			System.out.println("등록오류");
	}

	public void delete() {
		System.out.print("NAME>");
		String name;
		name = scanner.nextLine();
		scanner.reset();
		if (books.deleteData(name))
			System.out.println("삭제완료");
		else
			System.out.println("삭제오류");
	}

	public void search() {
		books.searchData();
	}
}