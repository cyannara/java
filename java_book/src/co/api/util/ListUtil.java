package co.api.util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//추가
		list.add("바나나");
		//삽입		
		list.add(0,"사과");
		//수정
		list.set(1, "키위");
		//삭제
		list.remove(0);
		//단건조회
		list.get(0);
		//전체조회
		System.out.println(list);
	}
}
