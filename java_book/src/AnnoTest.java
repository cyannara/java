

import java.sql.Date;

interface Viewable {
	@Deprecated
	void showIt(String str);
	void brShowIt(String str);
}

class Viewer implements Viewable {
	@Override
	//@SuppressWarnings("deprecation") 
	public void showIt(String str) {
		System.out.print(str);
	}
	@Override
	public void brShowIt(String str) {
		System.out.println(str);
	}	
}

public class AnnoTest {
	@SuppressWarnings({"unused","deprecation"}) 
	public static void main(String[] args) {
		Viewer view = new Viewer();
		view.showIt("hello");
		Date today = new Date(2018,10,10);
		String a = "";
	}
}
