package day09.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/** map 연습
 * key와 value 쌍으로 구성
 * key로 추가하고 key로 읽어냄
 * 검색용도로 사용
 */
public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		//추가
		map.put(100, "홍길동");
		map.put(110, "나길동");
		map.put(120, "김길동");
		
		//삭제
		map.remove(110);
		System.out.println("삭제 후: " + map);
		
		//변경
		map.put(110, "이순신");  
		System.out.println("변경 후: " +map);
		
		//검색 (사원번호 120 조회)
		System.out.println("120번 사원은 " + map.get(120) );
		
		
		//전체조회  -> key 전체를 list로 변환해서 
		Set<Integer> keys  =  map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		//전체조회 (Iterator)
		Set<Integer> keySet = map.keySet();             // 키 전체를 set에 담기
		Iterator<Integer> iter = keySet.iterator();     // 일렬로 정렬
		while(iter.hasNext()) {                         // 다음 원소가 있으면
			Integer key = iter.next();                  // 다음 키 조회
			String value = map.get(key);                // 키로 value 조회
			System.out.println( key +":" + value);
		}
		
		System.out.println(map);
	}

}
