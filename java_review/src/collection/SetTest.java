package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author USER
 * Set 연습 : 추가/삭제/조회
 * 중복값허용 안함 / 집합 구조
 */
public class SetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		//추가
		names.add("바나나");
		names.add("바나나");
		names.add("사과");
		
		System.out.println(names);
		
		//전체조회
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
		
		//삭제
		names.remove("사과");
		System.out.println(names);
	
		
		
	}

}

