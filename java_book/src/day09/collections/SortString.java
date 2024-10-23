package day09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("나기자");
		list.add("김유신");
		list.add("을지문덕");
		
		//정렬
		Collections.sort(list);
		
		//전체출력
		for(String temp : list) {
			System.out.println(temp);
		}
		
		//검색
		int idx = Collections.binarySearch(list, "을지문덕");
		System.out.println("검색위치:" + idx);
	}
}
