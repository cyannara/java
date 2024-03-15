package day05.co.yedam.bookrent;

import java.util.Scanner;
/*
 * 객체배열을 이용한 회원정보 등록/수정/삭제/조회 기능 구현
 */
public class MemberService  {
	
	Member[] members;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public MemberService() {
		members = new Member[maxCnt];
	}
	
	//등록
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("이름>");
		String name = scanner.next();
		System.out.print("전화번호>");
		String phone = scanner.next();
		members[cnt++] = new Member(name, phone); 
		System.out.println("등록된 건수:" + cnt);
	}
	
	//수정
	public void update() {
		System.out.printf("수정할 번호>");
		int idx = scanner.nextInt();
		if(idx >= cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("전화번호>");
		String phone = scanner.next();
		members[idx].setPhone(phone); 
		System.out.println("수정되었습니다.");
	}
	
	//삭제
	public void delete() {
		System.out.printf("삭제할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt-1; i++) {
			members[i] = members[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println("================================================================");
		System.out.println(String.format("%-30s%-30s", "이름", "전화번호"));
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-30s%-30s", members[i].getName(), members[i].getPhone()));
		}
		System.out.println("================================================================");
	}
	
	//단건조회(타이틀)
	public void selectOne() {
		System.out.printf("조회할 번호>");
		int idx = scanner.nextInt();
		if(idx >= cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println("========");
		System.out.println(String.format("이름:%s   전화번호:%s", members[idx].getName(), members[idx].getPhone()));
		System.out.println("========");
	}
	
}
