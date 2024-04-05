package 자바보강.middleTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStorage implements BookAccess {

	List<Book> list = new ArrayList<Book>();
	public static BookStorage instance = null;

	public static BookStorage getInstance() {
		if (instance == null)
			instance = new BookStorage();
		return instance;
	}

	BookStorage() {
	}

	public boolean saveData(Book b) {
		for (Book t : list) {
			if (b.equals(t))
				return false;
		}
		if (list.add(b))
			return true;
		return false;
	}

	public void searchData() {
		int cnt = 0;
		Iterator<Book> iter = list.iterator();
		while (iter.hasNext()) {
			Book t = iter.next();
			System.out.println(t.toString());
			cnt++;
		}
		System.out.println("총 건수는 " + cnt + "입니다");
	}

	public boolean deleteData(String name) {
		boolean flag = false;
		Iterator<Book> iter = list.iterator();
		while (iter.hasNext()) {
			Book t = iter.next();
			if (t.getName().contains(name)) {
				iter.remove();
				flag = true;
			}
		}
		return flag;
	}

}
