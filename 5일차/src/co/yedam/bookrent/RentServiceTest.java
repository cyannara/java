package co.yedam.bookrent;

import java.util.Scanner;


public class RentServiceTest {

	public static void main(String[] args) {

		RentService app = new RentService();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.도서대여등록  2.대여수정  3.대여취소  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.input();
			} else if (selectNo == 2) {
				app.update();
			} else if (selectNo == 3) {
				app.delete();
			} else if (selectNo == 4) {
				app.selectAll();
			}else if (selectNo == 5) {
				app.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
