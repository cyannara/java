package exam04_memo;

import java.util.Scanner;

public class MemoInsert  implements MemoService{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void execute(MemoData memoData) {
		System.out.print("DATE>");
		String date = scanner.next();
		System.out.print("TITLE>");
		String title = scanner.next();
		System.out.print("CONTENT>");
		String content = scanner.next();
		int no = memoData.momoList.size();
		memoData.insert(new Memo(no, date, title, content));
	}
}
