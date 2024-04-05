package 자바보강.exam04_memo;

import java.util.List;
import java.util.Scanner;

public class MemoFindDate implements MemoService {

	public MemoFindDate() {}
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void execute(MemoData momoList) {
		System.out.print("검색할 날짜>");
		String date = scanner.next();
		
		List<Memo> list = momoList.findDate(date); 
	
		for(Memo l : list) {
			System.out.println(l);
		}
		
		
	}

}
