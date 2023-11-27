package co.yedam.bookrent;

import java.util.Scanner;


public class MemberServiceTest {

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.회원등록  2.회원수정  3.회원삭제  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				memberService.input();
			} else if (selectNo == 2) {
				memberService.update();
			} else if (selectNo == 3) {
				memberService.delete();
			} else if (selectNo == 4) {
				memberService.selectAll();
			}else if (selectNo == 5) {
				memberService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
