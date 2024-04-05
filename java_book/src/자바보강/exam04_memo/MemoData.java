package 자바보강.exam04_memo;

import java.util.ArrayList;
import java.util.List;

public class MemoData extends MemoAccess  {
	
	ArrayList<Memo> momoList = new ArrayList<Memo>();

	@Override
	public void insert(Memo friend) {
		momoList.add(friend);
	}

	@Override
	public List<Memo> findDate(String date) {
		List<Memo> list = new ArrayList<Memo>(); 
		for (Memo b : momoList) {
			if(b.getDate().equals(date)) {
				list.add(b); 
			}
		}
		return list; 
	}

}
