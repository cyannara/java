package day03.co.yedam.test;

import java.util.Scanner;

public class Exam06Main {
	public static void main(String[] args) {

		Exam06 app = new Exam06();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.학생수  2.점수입력  3.점수리스트  4.분석   5.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.print();
			} else if (selectNo == 4) {
				app.avg();
				app.max();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}
}
