package javautil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArraylistTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//1. 추가
		//list.addFirst(e);   //linked 에만 있음
		list.add("바나나");
		list.add("파인애플");
		list.add("사과");     // 추가
		
		list.add(1,"메론");   // 삽입
		list.set(0,"딸기");   // 수정
		System.out.println(list);
		
		//2. 삭제
		//list.removeFirst();  //linked 에만 있음
		//list.remove(1);      // 삭제
		//list.remove("사과");
		System.out.println(list);
		
		//3. 검색
		System.out.println("첫번째 과일은 " + list.get(0) );
		
		//4. 전체조회
		for(int i=0; i<list.size(); i++) {
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		for( Object  f : list  ) {
			System.out.println( ( (String)f).length() );  // 각 노드의 문자열 길이 
		}
		
		//5. 정렬, 섞기
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
