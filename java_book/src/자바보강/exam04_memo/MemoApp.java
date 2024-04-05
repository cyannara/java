package 자바보강.exam04_memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		MemoData books = new MemoData();
		books.insert(new Memo(1,"20210102","자바","자바를 배우자"));
		books.insert(new Memo(2,"20210102","모임","1시에 모임"));
		books.insert(new Memo(3,"20210103","todo list","시험"));
		books.insert(new Memo(4,"20210104","모임","2시에 모임"));
		int menu =0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1.등록   2.날짜로조회   0.종료");
			System.out.print("입력>");
			menu = scanner.nextInt();
			if(menu ==1) {
				MemoInsert service = new MemoInsert();
				service.execute(books);				
			}else if (menu == 2) {
				MemoFindDate service = new MemoFindDate();
				service.execute(books);
			}	
		}while(menu !=0);
	}

}
