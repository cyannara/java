package co.yedam.emp;

import java.util.Scanner;

import co.yedam.test.Exam06;

public class EmployeeAppMain {
public static void main(String[] args) {
	EmployeeApp app = new EmployeeApp();
	Scanner scanner = new Scanner(System.in);
	int selectNo = 0;
	boolean run = true;

	while (run) {
		System.out.println("1.사원수  2.사원정보입력  3.사원리스트  4.검색  5.급여합계   6.종료");
		System.out.print("선택>");
		selectNo = scanner.nextInt();
		if (selectNo == 1) {
			app.init();
		} else if (selectNo == 2) {
			app.input();
		} else if (selectNo == 3) {
			app.print();
		} else if (selectNo == 4) {
			System.out.print("검색할 사번>");
			int no = scanner.nextInt();
			String name = app.search(no);
			System.out.println("이름은 "+ name);
		}else if (selectNo == 5) {
			int s = app.sum();
			System.out.println("급여합계 = " + s);
		} else if (selectNo == 6) {
			run = false;
		}
	}
	System.out.println("프로그램 종료");
	scanner.close();
}
}
