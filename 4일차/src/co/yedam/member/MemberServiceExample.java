package co.yedam.member;

import java.util.Scanner;

import co.yedam.test.Exam06;

public class MemberServiceExample {
	public static void main(String[] args) {

		MemberService app = new MemberService();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.등록  2.전체조회  3.번호로조회  4.로그인  5.id로조회   6.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.insert();
			} else if (selectNo == 2) {
				//app.memberList();
			} else if (selectNo == 3) {
				//app.print();
			} else if (selectNo == 4) {
				
			} else if (selectNo == 5) {
				
			} else if (selectNo == 6) {
				
			}
		}
		System.out.println("buy!!!");
		scanner.close();

	}
}
