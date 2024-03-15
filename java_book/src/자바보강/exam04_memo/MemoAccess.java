package exam04_memo;

import java.util.List;

// 메모관리 개발 표준
public  abstract class MemoAccess {
	//등록
	public abstract void insert(Memo memo);	
	//날짜로조회
	public abstract List<Memo> findDate(String date);
		
}
