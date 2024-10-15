package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author 김유미
 * ArrayList 연습(추가/수정/삭제/변경/조회/전체조회)
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		
		//객체 생성
		LinkedList<String> list = new LinkedList<String>();
		
		//추가
		list.add("바나나");
		list.add("바나나");
		list.add("사과");
		list.add("메론");  //추가
		list.add(0,"수박");//삽입
		
		System.out.println(list);
		
		//삭제
/*		list.remove(0);
		list.remove("메론");
		System.out.println(list); */
		
		//변경
		list.set(0, "망고");
		System.out.println(list);
		
		//조회
		System.out.println( "첫번째 과일은: " + list.get(0) );
		
		//전체조회 - for
		for(int i=0; i< list.size() ; i++ ) {
			System.out.println(i +" : " + list.get(i));
		}
		
		
		//전체조회 - 확장 for
		int cnt = 0;
		for( String temp : list ) {
			System.out.println(cnt + " : " + temp);
			cnt++;
		}
		
		//전체조회 iterator(반복자)
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
		
	}
}
