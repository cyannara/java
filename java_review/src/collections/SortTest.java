package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("나기자");
		list.add("김유신");
		list.add("을지문덕");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int idx = Collections.binarySearch(list, "을지문덕");
		System.out.println("검색위치:" + idx);
	}
}
