package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author user
 * ArrayList 연습(추가,삭제,조회)
 * 순차구조, 
 * 차례대로 조회
 * index 사용(배열) 
 */
public class ListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		//추가
		list.add("사과");
		list.add("키위");
		list.add("딸기");
		System.out.println(list);
		//삽입
		list.add(0,"메론");     
		System.out.println(list);
		//삭제
		list.remove(1);
		System.out.println(list);
		
		//변경
		list.set(0, "망고");
		System.out.println(list);
		
		//조회
		System.out.println( "첫번째 과일은: " + list.get(0) );
		
		//전체조회 1.for
		String temp = null;
		for(int i=0; i< list.size(); i++) {
			temp = list.get(i);
			System.out.println(i + " : " + temp);
		}
		//2. 확장 for
		System.out.println("확장for=============");
		for(String  f  : list ) {
			System.out.println( f );
		}
		//3.iterator
		System.out.println("iterator=============");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			temp = iter.next();
			System.out.println( temp );
		}
	}
}
