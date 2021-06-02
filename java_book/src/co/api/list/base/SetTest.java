package co.api.list.base;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 중복값 허용 안 함, 순서 없슴
 * @author user
 *
 */
public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("바나나");
		set.add("사과");
		System.out.println(set);
		
		//삭제
		set.remove("바나나");
		
		//전체조회
		for(String temp : set ) {
			System.out.println(temp);
		}
		
		//전체조회 Iterator
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
	}

}
