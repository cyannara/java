package day09.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * List의 요소 타입이 Map인 경우 
 * 
 */
public class ListMapTest {

	public static void main(String[] args) {
		
		ArrayList<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("first_name", "길동");
		map.put("last_name", "홍");
		map.put("salary", 20000);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("first_name", "문덕");
		map.put("last_name", "을지");
		map.put("salary", 25000);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("first_name", "유신");
		map.put("last_name", "김");
		map.put("salary", 15000);
		list.add(map);
		
		//전체출력
		System.out.println(list);
		
		//두번째 사원의 급여는?
		System.out.println(list.get(1).get("salary"));
		
		//이름만출력
		for(int i=0; i<list.size(); i++) {
			//map = list.get(i);
			//System.out.println(map.get("name"));
			System.out.println(list.get(i).get("name")); // 메서드체인
		}
		
		for(Map<String, Object> temp : list) {
			System.out.println("==" + temp.get("name"));
		}
		
		//전체급여와 급여합계를 출력
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += (Integer)list.get(i).get("salary");
		}
		System.out.println(sum);
		
	}

}
