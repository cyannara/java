package javautil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  List에 Map을 저장 
 *
 */
public class ListMapTest {

	public static void main(String[] args) {

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	
		Map<String, String> map = new HashMap<String, String>();
		//첫번째 사원
		map.put("name", "홍길동");
		map.put("salary", "1000");
		map.put("deaprtment", "총무");
		list.add(map);
		
		map = new HashMap<String, String>();
		//두번째 사원
		map.put("name", "이순신");
		map.put("salary", "2000");
		map.put("deaprtment", "인사");
		list.add(map);
		
		System.out.println(list);
		//이름만 출력
		for(Map<String, String> temp : list ) {
			System.out.println(temp.get("name"));
		}
		
		for(int i=0; i<list.size(); i++) {
			Map<String, String> temp = list.get(i);
			String name = temp.get("name");
			
			String name2 = list.get(i).get("name");
			System.out.println(name2);
		}
		//전체 급여 계산
		
	}

}
