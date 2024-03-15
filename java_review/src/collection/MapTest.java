package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author USER
 * Map 연습(추가/수정/삭제/변경/조회/전체조회)
 * 조회 목적 / key 와 value 쌍으로 구성
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//추가
		map.put("101", "홍길동");
		map.put("102", "을지문덕");
		map.put("103", "김유신");
		
		System.out.println(map);
		
		//삭제
		map.remove("101");
		System.out.println(map);
		
		//변경
		map.put("102", "이순신");  
		System.out.println(map);
		
		//조회
		System.out.println("103번 :" + map.get("103"));
		
		//전체조회
		Set<String> keys = map.keySet();  //키 전체를 목록
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String name = map.get(key);
			System.out.println(key + " : " + name);
		}
	}
}












