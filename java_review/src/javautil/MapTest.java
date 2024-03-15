package javautil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Map
 *  key 를 통해서 저장, 읽고, 삭제
 *  검색
 */
public class MapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1","사과");
		map.put("2","배");
		map.put("3","메론");
		
		map.put("1","바나나");  // 키 중복 안됨. 변경이 됨		
		System.out.println(map);
		
		//삭제
		map.remove("2");  // 키(key) 로 삭제
		
		//조회(검색)  
		System.out.println(map.get("3"));
		
		//전체조회
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}
