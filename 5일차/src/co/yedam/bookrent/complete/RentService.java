package co.yedam.bookrent.complete;

import java.util.Scanner;
/*
 * 객체배열을 이용한 도서대여정보 등록/수정/삭제/조회 기능 구현
 */
public class RentService implements Service {
	
	Rent[] rents;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public RentService() {
		rents = new Rent[maxCnt];
	}
	
	//등록
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("회원이름>");
		String name = scanner.next();
		System.out.print("도서명>");
		String title = scanner.next();
		rents[cnt++] = new Rent(name, title, "20210601"); 
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
		System.out.print("도서명>");
		String title = scanner.next(); 
		rents[idx].setTitle(title);
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
			rents[i] = rents[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println("================================================================");
		System.out.println(String.format("%-30s%-30s%-30s", "이름", "도서명", "대출일자"));
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-30s%-30s%-30s", rents[i].getName(), rents[i].getTitle(), rents[i].date));
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
		System.out.println(String.format("이름:%s   전화번호:%s   대출일자:%s", rents[idx].getName(), rents[idx].getTitle(), rents[idx].getDate()));
		System.out.println("========");
	}
	
}
