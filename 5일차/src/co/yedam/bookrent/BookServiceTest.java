package co.yedam.bookrent;

import java.util.Scanner;


public class BookServiceTest {

	public static void main(String[] args) {

		BookService bookService = new BookService();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.도서등록  2.도서수정  3.도서삭제  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				bookService.input();
			} else if (selectNo == 2) {
				bookService.update();
			} else if (selectNo == 3) {
				bookService.delete();
			} else if (selectNo == 4) {
				bookService.selectAll();
			}else if (selectNo == 5) {
				bookService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
